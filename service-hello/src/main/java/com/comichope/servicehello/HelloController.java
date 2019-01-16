package com.comichope.servicehello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${server.port}")
    String port;

    @RequestMapping(value = "hello")
    public String hello(String name) {
        return "hello! " + name + ",port:" + port;
    }
}
