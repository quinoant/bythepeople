package com.bythepeople.watcher.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/v1/helloworld")
public class HelloWorld {
    @GetMapping("/{name}")
    public String get(@PathVariable("name") String name){
        return "Hello " + name;
    }
}
