package com.restapi.portfolio.service;

import com.restapi.portfolio.model.About;
import com.restapi.portfolio.repository.AboutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AboutService {
    @Autowired
    private AboutRepository aboutRepository;

    public String postUserAbout(About about) {
        aboutRepository.save(about);
        return "Post added!";
    }


    public List<About> getUserAbout() {
        return aboutRepository.findAll();
    }


}
