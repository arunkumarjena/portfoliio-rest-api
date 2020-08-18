package com.restapi.portfolio.service;

import com.restapi.portfolio.model.Contact;
import com.restapi.portfolio.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {
    @Autowired
    private ContactRepository contactRepository;

    public String contactPost(Contact contact){
        contactRepository.save(contact);
        return "Contact added!";
    }
    public List<Contact> getContact(){
        return contactRepository.findAll();
    }
}
