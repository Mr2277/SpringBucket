package com.child.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        System.out.println("新的电脑");
        SpringApplication.run(DemoApplication.class, args);
    }

}
