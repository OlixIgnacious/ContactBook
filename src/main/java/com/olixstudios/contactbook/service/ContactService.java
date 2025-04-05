package com.olixstudios.contactbook.service;

import java.util.List;

import com.olixstudios.contactbook.model.Contact;

public interface ContactService {
    void addContact(String name, String phone);
    Contact getContact(String name);
    List<Contact> getAllContacts();
    boolean deleteContact(String name);
}
