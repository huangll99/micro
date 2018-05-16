package com.hll.micro.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Author: huangll
 * Written on 18/5/16.
 */
@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class MicroGatewayApplication {

  public static void main(String[] args) {
    SpringApplication.run(MicroGatewayApplication.class, args);
  }
}
