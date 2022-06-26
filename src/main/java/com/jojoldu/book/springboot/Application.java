package com.jojoldu.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 항상 프로젝트의 최상단에 위치해야 한다.
@SpringBootApplication
public class Application {

    // mainClass
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
