package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author barnnet
 * @date 2019/10/9
 */
@RestController
public class TestController {
    @RequestMapping("/join")
    public String getMessage(){
        return "success";
    }
}
