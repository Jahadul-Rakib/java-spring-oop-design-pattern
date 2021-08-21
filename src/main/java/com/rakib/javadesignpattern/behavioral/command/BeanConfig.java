package com.rakib.javadesignpattern.behavioral.command;

import com.rakib.javadesignpattern.behavioral.command.hardware.Light;
import com.rakib.javadesignpattern.behavioral.command.hardware.Music;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {
    @Bean
    @Scope(value = "singleton")
    Light light() {
        return new Light();
    }

    @Bean
    @Scope(value = "singleton")
    Music music() {
        return new Music();
    }
}
