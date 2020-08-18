package com.restapi.portfolio.controller;

import com.restapi.portfolio.model.Home;
import com.restapi.portfolio.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/portfolio/home/api")
public class HomeController {
    @Autowired
    private HomeService homeService;

//    @RequestMapping(method = RequestMethod.POST,value = "/description")
//    @ResponseStatus(HttpStatus.CREATED)
//    public void postDescription(@RequestBody Home home) {
//        homeService.description(home);
//    }
    @RequestMapping(method = RequestMethod.GET, value = "/description")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Home> getDescription(){
        return homeService.getDescription();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/description")
    public ResponseEntity saveDescription(@RequestBody Home home){
        homeService.description(home);
        return new ResponseEntity("Description saved successfully",HttpStatus.OK);
    }

}
