package com.olixstudios.contactbook.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

import com.olixstudios.contactbook.model.Contact;

public class ContactServiceImpl implements ContactService {

    private final Map<String, Contact> contactMap = new HashMap<>();

    @Override
    public void addContact(String name, String phone) {
        contactMap.put(name, new Contact(name, phone));
    }

    @Override
    public Contact getContact(String name) {
        return contactMap.get(name);
    }

    @Override
    public List<Contact> getAllContacts() {
        TreeSet<String> sortedNames = new TreeSet<>(contactMap.keySet());
        List<Contact> sortedContacts = new ArrayList<>();
        for (String name : sortedNames) {
            sortedContacts.add(contactMap.get(name));
        }
        return sortedContacts;
    }

    @Override
    public boolean deleteContact(String name) {
        return contactMap.remove(name.toLowerCase()) != null;
    }
}
