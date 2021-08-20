package com.rakib.javadesignpattern.behavioral.chain_of_responsiblity;

import com.rakib.javadesignpattern.behavioral.chain_of_responsiblity.service.ChainBaseHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        ChainBaseHandler.Chain();
    }

}
