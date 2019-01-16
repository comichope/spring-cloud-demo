package com.comichope.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${username}")
    String username;

    @RequestMapping("hi")
    public String hi(String name) {
        return username;
//        return name;
    }
}
