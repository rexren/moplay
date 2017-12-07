package com.hikvision.rensu.moplay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author rensu
 */
@SpringBootApplication
@EnableEurekaClient
public class ComponentApplication {
    public static void main(String[] args) {
        SpringApplication.run(ComponentApplication.class, args);
    }
}