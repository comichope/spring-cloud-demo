package com.comichope.servicefeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired
    FeignService feignService;

    @GetMapping(value = "hi")
    public String hi(String name) {
        return feignService.hi(name);
    }
}
