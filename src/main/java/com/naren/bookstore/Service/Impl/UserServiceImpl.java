package com.naren.bookstore.Service.Impl;

import com.naren.bookstore.Entity.Role;
import com.naren.bookstore.Entity.User;
import com.naren.bookstore.Repository.UserRepository;
import com.naren.bookstore.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository  userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User saveUser(User user) {

        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole(Role.USER);
        user.setCreateTime(LocalDateTime.now());
        return userRepository.save(user);
    }

    @Override
    public User findUserByUsername(String username) {
        return userRepository.findByUserName(username);
    }

    @Transactional
    @Override
    public void makeAdmin(String username) {
        userRepository.updateUserRole(username,Role.ADMIN);
    }


}
