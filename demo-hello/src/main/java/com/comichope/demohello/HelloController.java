package com.comichope.demohello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${server.port}")
    String port;

    @RequestMapping(value = "hello")
    public String hello(@RequestParam("name") String name) {
        return "hello! " + name + ",port:" + this.port;
    }
}
