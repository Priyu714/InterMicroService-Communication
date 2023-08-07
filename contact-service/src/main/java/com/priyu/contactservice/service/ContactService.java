package com.priyu.contactservice.service;

import com.priyu.contactservice.model.Contact;

import java.util.List;

public interface ContactService {

    public List<Contact> getContact(Long id);
}
