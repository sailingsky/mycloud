package com.example.demo;

import jdk.nashorn.internal.ir.RuntimeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shuangjian on 2017/6/23.
 */
@RestController
public class CosumerController {

    @Autowired
    ComputeClient computeClient;

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public Integer add(){
        return computeClient.add(10,20);
    }
}
