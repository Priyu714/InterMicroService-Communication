package com.priyu.contactservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Contact {

    private Long cId;
    private String email;
    private String contactName;
    private Long userId;

}