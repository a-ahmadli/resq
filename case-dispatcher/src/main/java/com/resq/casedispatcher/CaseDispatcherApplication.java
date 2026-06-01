package com.resq.casedispatcher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CaseDispatcherApplication {
  public static void main(String[] args) {
    SpringApplication.run(CaseDispatcherApplication.class, args);
  }
}
