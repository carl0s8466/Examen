package com.example.cbcconfigservidor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CbcConfigServidorApplication {

    public static void main(String[] args) {
        SpringApplication.run(CbcConfigServidorApplication.class, args);
    }

}