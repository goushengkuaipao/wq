package com.wq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by wang on 2017/7/2.
 */
@Controller
@RequestMapping(value = "/demo")
public class DemoController {

    public DemoController(){
        System.out.println("DemoController");
    }

    @RequestMapping(value = "/v1", method = RequestMethod.GET)
    public String Demo(){
        return "/jsp/test.html";
    }
}
