package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Aubergine
 * zhaoshuangquan@allinmd.cn
 * 2017-08-02 14:28
 */
@RestController
@RequestMapping(path="/test")
public class HelloWorldController {

    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }

}
