package com.priyu.user_service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Long userId;
    private String name;
    private String phone;

    List<Contact> contacts= new ArrayList<>();
}
