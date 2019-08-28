package com.itmuch.cloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//spring cloud中服务发现组件有多种选择，@EnableDiscoveryClient为各种服务组件提供了支持
//而@EnableEurekaClient只表明是eureka的client
@EnableDiscoveryClient
@SpringBootApplication
public class ProviderUserApplication {
  public static void main(String[] args) {
    SpringApplication.run(ProviderUserApplication.class, args);
  }
}
