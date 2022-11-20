package com.github.billy.securitybreach8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class SecurityBreach8Application {

  public static void main(String[] args) {
    SpringApplication.run(SecurityBreach8Application.class, args);
  }

}
