package com.springboot.mybatis.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/**
 * Created by sen on 2016/7/29.
 */
@EnableAutoConfiguration
@ComponentScan
@Configuration
public class SampleApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleApplication.class, args);
    }
}