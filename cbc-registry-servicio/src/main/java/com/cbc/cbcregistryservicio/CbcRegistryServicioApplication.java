package com.cbc.cbcregistryservicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CbcRegistryServicioApplication {

    public static void main(String[] args) {
        SpringApplication.run(CbcRegistryServicioApplication.class, args);
    }

}
