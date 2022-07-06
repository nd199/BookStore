package com.naren.bookstore.Service;

import com.naren.bookstore.Entity.User;

public interface AuthenticationService {

    User signInAndReturnJWT(User signInRequest);
}
