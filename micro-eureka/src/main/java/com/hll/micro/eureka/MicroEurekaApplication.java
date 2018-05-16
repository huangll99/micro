package com.hll.micro.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Author: huangll
 * Written on 18/5/16.
 */
@SpringBootApplication
@EnableEurekaServer
public class MicroEurekaApplication {

  public static void main(String[] args) {
    SpringApplication.run(MicroEurekaApplication.class, args);
  }

}
