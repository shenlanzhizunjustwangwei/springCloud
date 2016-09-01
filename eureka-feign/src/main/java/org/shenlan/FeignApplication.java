package org.shenlan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by wangwei on 2016/9/1.
 */
@EnableFeignClients
@SpringBootApplication
@EnableDiscoveryClient
public class FeignApplication {

    public static void main(String[] args){
        SpringApplication.run(FeignApplication.class,args);
    }
}
