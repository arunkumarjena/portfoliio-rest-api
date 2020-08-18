package com.restapi.portfolio.service;

import com.restapi.portfolio.model.Home;
import com.restapi.portfolio.repository.HomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeService {
    @Autowired
    private HomeRepository homeRepository;

    public String description(Home home) {
        homeRepository.save(home);
        return "Description added successfully";
    }
    public List<Home> getDescription(){
        return homeRepository.findAll();
    }

}
