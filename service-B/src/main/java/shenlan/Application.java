package shenlan;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by wangwei on 2016/9/1.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Application {
    public static void main(String[] args){
        new SpringApplicationBuilder(Application.class).web(true).run(args);
    }
}
