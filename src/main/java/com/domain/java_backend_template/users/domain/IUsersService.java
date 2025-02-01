package com.domain.java_backend_template.users.domain;

import com.domain.java_backend_template.users.domain.domainObjects.User;


public interface IUsersService {
    User create(User user);
    User get(String id);
    User update(String id, User udrt);
    void delete(String id);
}