package com.itcast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author XHW
 * @date 2020/4/17 - 23:07
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class APPMember1 {

    public static void main(String[] args) {
        SpringApplication.run(APPMember1.class,args);
    }

}
