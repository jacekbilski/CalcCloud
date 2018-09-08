package com.webcalc.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.webcalc")
public class WebCalcApplication {

  public static void main(String[] args) {
    SpringApplication.run(WebCalcApplication.class, args);
  }
}