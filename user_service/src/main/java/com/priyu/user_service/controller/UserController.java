package com.priyu.user_service.controller;

import com.priyu.user_service.model.User;
import com.priyu.user_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;


    @Autowired
    RestTemplate restTemplate;


    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id){
        User user = userService.getUser(id);

//        List contact = restTemplate.getForObject("http://localhost:8586/contact/" +id, List.class);
        List contact = restTemplate.getForObject("http://contact-service/contact/" +id, List.class);
        user.setContacts(contact);

       return user ;
    }


}
