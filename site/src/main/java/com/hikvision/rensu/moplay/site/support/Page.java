package com.hikvision.rensu.moplay.site.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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
