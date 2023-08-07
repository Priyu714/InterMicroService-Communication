package com.priyu.contactservice.controller;

import com.priyu.contactservice.model.Contact;
import com.priyu.contactservice.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    ContactService contactService;

    @GetMapping("{id}")
    public List<Contact> getContact(@PathVariable Long id){
        return contactService.getContact(id);
    }
}
