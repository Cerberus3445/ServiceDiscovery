package com.cerberus.servicediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class HardwareShopServiceDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(HardwareShopServiceDiscoveryApplication.class, args);
    }

}
