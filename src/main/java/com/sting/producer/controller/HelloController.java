package com.sting.producer.controller;

import java.util.Date;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {


    @GetMapping("/")
    public String hello(@RequestParam String name){
        System.out.println("service used~~~");
        return "hello " + name + " 现在时间：" + new Date();
    }
}
