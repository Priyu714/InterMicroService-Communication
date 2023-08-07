package com.priyu.user_service.service;

import com.priyu.user_service.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    List<User> list = Arrays.asList(
            new User(1L,"Alice","1234567890", new ArrayList<>()),
            new User(2L, "Bob", "0987654321", new ArrayList<>()),
            new User(3L, "Charlie", "1112223333", new ArrayList<>()),
            new User(4L, "Dave", "4445556666", new ArrayList<>()),
            new User(5L, "Eve", "7778889999", new ArrayList<>()),
            new User(6L, "Frank", "0001112222", new ArrayList<>()),
            new User(7L, "Grace", "3334445555", new ArrayList<>())
    );

    @Override
    public User getUser(Long id) {
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny()
                        .orElseThrow(null);
    }
}
