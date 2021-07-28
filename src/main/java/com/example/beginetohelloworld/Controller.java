package com.example.beginetohelloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class Controller {

    @GetMapping("/post")
    public String helloWorld(@RequestBody String hello) {
        String helloWorld = hello + "World!!";
        return helloWorld;
    }
}
