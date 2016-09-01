package org.shenlan.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by wangwei on 2016/9/1.
 */
@Service
public class ComputeService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "addServiceFallback")
    public String addService(){
        return restTemplate.getForEntity("http://COMPUTE_SERVICE/add?a=20&b=20",String.class).getBody();
    }
    public String addServiceFallback(){
        return "error";
    }
}
