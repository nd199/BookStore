package com.naren.bookstore.MyBeans;

import com.naren.bookstore.Security.JWT.JwtAuthFilter;
import com.naren.bookstore.Service.AuthenticationService;
import com.naren.bookstore.Service.Impl.AuthenticationServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class MyBeans {

    @Bean
    public PasswordEncoder passwordEncoder() { return new BCryptPasswordEncoder(); }
    @Bean
    public JwtAuthFilter jwtAuthFilter() { return new JwtAuthFilter(); }
    @Bean
    public AuthenticationService  authenticationService()   { return new AuthenticationServiceImpl(); }

}
