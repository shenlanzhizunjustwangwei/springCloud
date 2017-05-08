package org.shenlan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by wangwei on 2016/9/1.
 */
@SpringBootApplication
@EnableConfigServer
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }
}
