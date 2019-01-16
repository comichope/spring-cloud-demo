package com.comichope.servicefeign;

import org.springframework.stereotype.Component;

@Component
public class FeignServiceBack implements FeignService {
    @Override
    public String hi(String name) {
        return "error!" + name;
    }
}
