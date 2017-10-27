package com.cotydon;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="demo-config-client", url="127.0.0.1:5555")
public interface FeignService {
    @RequestMapping(value = "/con/hello",method = RequestMethod.POST)
    public  String  getHello();
    @RequestMapping(value = "/refresh",method = RequestMethod.POST)
    public String refreh();
}
