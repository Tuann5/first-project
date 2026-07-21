package com.hota.githubactionlab.controller;

import com.hota.githubactionlab.service.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@RequiredArgsConstructor
public class HelloController {

    private final HelloService service;

    @GetMapping
    public String hello() {
        return service.getMessage();
    }
}
