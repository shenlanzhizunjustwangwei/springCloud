package org.shenlan;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Created by wangwei on 2016/9/1.
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args){
        new SpringApplicationBuilder(Application.class).web(true).run(args);
    }
}
