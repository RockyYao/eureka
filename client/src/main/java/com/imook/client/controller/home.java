package com.imook.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class home {

    @Value("${server.port}")
private String port;

    @RequestMapping("/hello")
    @ResponseBody
    public String home(){

        return "hello"+port;

    }


}
