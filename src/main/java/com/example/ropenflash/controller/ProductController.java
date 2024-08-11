package com.example.ropenflash.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class ProductController{

    @GetMapping("/")
    public String getProducts(){
       return "Hello World" ;
    }
}