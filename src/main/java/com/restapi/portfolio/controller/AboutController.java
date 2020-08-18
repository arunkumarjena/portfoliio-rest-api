package com.restapi.portfolio.controller;

import com.restapi.portfolio.model.About;
import com.restapi.portfolio.service.AboutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/portfolio/about/api")
public class AboutController {
    @Autowired
    private AboutService aboutService;

    @RequestMapping(method = RequestMethod.POST,value = "/about/post")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String post(@RequestBody  About about){
        aboutService.postUserAbout(about);
        return "about post added!";
    }

    @RequestMapping(method= RequestMethod.GET,value = "/about")
    @ResponseStatus(HttpStatus.FOUND)
    public List<About> getUser(){
        return aboutService.getUserAbout();
    }

}
