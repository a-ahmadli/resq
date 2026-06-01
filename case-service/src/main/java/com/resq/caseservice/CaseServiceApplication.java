package com.resq.caseservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CaseServiceApplication {
  public static void main(String[] args) {
    SpringApplication.run(CaseServiceApplication.class, args);
  }
}
