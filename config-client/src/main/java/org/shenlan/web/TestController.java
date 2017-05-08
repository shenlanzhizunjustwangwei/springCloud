package org.shenlan.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangwei on 2016/9/1.
 */
@RefreshScope
@RestController
public class TestController {

    @Value("${from}")
    private String from;
    @Value("${test}")
    private String test;

    @RequestMapping("/from")
    public String from(){
        return this.from+this.test;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}
