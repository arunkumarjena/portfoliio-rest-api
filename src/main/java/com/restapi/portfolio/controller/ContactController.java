package com.restapi.portfolio.controller;

import com.restapi.portfolio.model.Contact;
import com.restapi.portfolio.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/portfolio/contact/api")
public class ContactController {
    @Autowired
    private ContactService contactService;

    @RequestMapping(method = RequestMethod.POST, value = "/postContact")
    @ResponseStatus(HttpStatus.CREATED)
    public String postContact(@RequestBody Contact contact){
        contactService.contactPost(contact);
        return "Contact added!";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/contacts")
    @ResponseStatus(HttpStatus.FOUND)
    public List<Contact> getContact(){
        return contactService.getContact();
    }

}
