package org.shenlan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangwei on 2016/9/1.
 */
@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    public String home(){
        return "Hello World,Wangwei!";
    }

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
