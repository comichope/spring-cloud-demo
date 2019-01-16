package com.comichope.servicefeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hello", fallback = FeignServiceBack.class)
public interface FeignService {
    @RequestMapping(value = "/hello")
    String hi(@RequestParam("name") String name);
}
