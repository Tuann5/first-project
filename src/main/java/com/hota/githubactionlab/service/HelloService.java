package com.hota.githubactionlab.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String getMessage() {
        return "Hello GitHub Actions";
    }
}
