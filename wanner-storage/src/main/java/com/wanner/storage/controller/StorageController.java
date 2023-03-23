package com.wanner.storage.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StorageController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
