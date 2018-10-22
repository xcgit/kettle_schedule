package com.kettle_schedule.controller;

import com.kettle_schedule.services.KettleService;
import com.kettle_schedule.services.KettleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class testController {
    @Autowired
    private KettleService m;

    @RequestMapping("/ceshi")
    public String test(String path){
        m.callNativeTrans(null,path);
        return "s";

    }
}
