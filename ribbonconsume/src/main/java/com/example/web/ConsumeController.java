package com.example.web;

import com.example.service.CustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by shuangjian on 2017/6/20.
 */
@RestController(value = "/consume")
public class ConsumeController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    CustomService customService;

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String add(){
        return customService.addService();
    }
}
