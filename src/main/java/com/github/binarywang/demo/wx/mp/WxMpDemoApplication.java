package com.github.binarywang.demo.wx.mp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author BlackR
 */
@SpringBootApplication
@ComponentScan(value = "com.github.binarywang.demo.wx.mp.mapper")
public class WxMpDemoApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(WxMpDemoApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(WxMpDemoApplication.class, args);
    }
}
