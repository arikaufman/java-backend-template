package com.domain.java_backend_template.users.domain;

import org.springframework.stereotype.Service;
import com.domain.java_backend_template.users.domain.domainObjects.User;

@Service
public class UsersService implements IUsersService {
    @Override
    public User create(User user) {
        User user_to_return = new User("1L", "John", "Doe");
        return user_to_return;    
    }

    @Override
    public User get(String id) {
        User user_to_return = new User("1L", "John", "Doe");
        return user_to_return;    
    }

    @Override
    public User update(String id, User user) {
        User user_to_return = new User("1L", "John", "Doe");
        return user_to_return;
    }

    @Override
    public void delete(String id) {
        return;
    }
}