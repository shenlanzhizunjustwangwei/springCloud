package org.shenlan.eureka;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by wangwei on 2016/9/1.
 */
@SpringBootApplication
@EnableEurekaServer
public class Application {
    public static void main(String[] args){
            new SpringApplicationBuilder(Application.class).web(true).run(args);
    }
}
