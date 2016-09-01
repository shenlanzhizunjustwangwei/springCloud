package org.shenlan;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by wangwei on 2016/9/1.
 */
@EnableZuulProxy
@SpringCloudApplication
public class Application {
    public static void main(String[] args){
        new SpringApplicationBuilder(Application.class).web(true).run(args);
    }
}
