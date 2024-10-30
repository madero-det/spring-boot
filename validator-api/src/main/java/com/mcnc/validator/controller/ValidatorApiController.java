package com.mcnc.validator.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api")
public class ValidatorApiController {
    
    @GetMapping("message")
    public String getMethodName() {
        return "Hello World!";
    }

}
