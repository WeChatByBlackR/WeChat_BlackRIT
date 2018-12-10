package com.github.binarywang.demo.wx.mp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
    @GetMapping("/test")
    public String test() {
        System.out.printf("helloWord111");
        return "helloWord";
    }
}
