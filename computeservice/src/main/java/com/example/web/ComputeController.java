package com.example.web;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shuangjian on 2017/6/19.
 */
@RestController
public class ComputeController {

    private final Logger logger = Logger.getLogger(getClass());

    @RequestMapping(value="/add",method= RequestMethod.GET)
    public Integer add(@RequestParam Integer a,@RequestParam Integer b){
        Integer r=a+b;
        logger.info("/add");
        return r;
    }
}
