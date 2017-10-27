package com.cotydon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignControllor {
    @Autowired
    private FeignService feignService;

    @RequestMapping(value = "/info")
    public String getHelloInfo() {
        return feignService.getHello();
    }

    @RequestMapping(value = "/refresh")
    public String refresh() {
        feignService.refreh();
        return "it's ok!";
    }

}
