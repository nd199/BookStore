package com.naren.bookstore.Security;

import com.naren.bookstore.Entity.User;
import com.naren.bookstore.Service.UserService;
import com.naren.bookstore.Util.SecurityUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userService.findUserByUsername(username);
        Set<GrantedAuthority> authorities = Set.of(SecurityUtil.convertToAuthority(user.getRole().name()));
        return UserPrinciple.builder().
                user(user).userId(user.getUserId())
                .username(username)
                .password(user.getPassword())
                .authorities(authorities)
                .build();
    }
}
