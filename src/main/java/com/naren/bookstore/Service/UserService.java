package com.naren.bookstore.Service;

import com.naren.bookstore.Entity.User;
import com.naren.bookstore.Repository.UserRepository;

public interface UserService {

     User saveUser(User user);

     User findUserByUsername(String username);

     void makeAdmin(String username);


}
