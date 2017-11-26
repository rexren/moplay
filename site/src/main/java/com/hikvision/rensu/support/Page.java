package com.hikvision.rensu.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
public class Page {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(path = {"/", "/index"})
    @ResponseBody
    public String home(){
        return restTemplate.getForObject("http://USER-SERVICE/users", String.class);
    }

}
