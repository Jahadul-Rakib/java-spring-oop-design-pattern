package com.rakib.javadesignpattern.behavioral.iterator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        ListIterator<String> iterator = Arrays.asList("A","B","C").listIterator();
        iterator.forEachRemaining(s -> {
            System.out.println(s +" Current Value.");
        });

    }
}
