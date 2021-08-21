package com.rakib.javadesignpattern.behavioral.command.service.impl;

import com.rakib.javadesignpattern.behavioral.command.service.Command;
import org.springframework.stereotype.Component;

@Component
public class NoOpsCommand implements Command {

    @Override
    public void execute() {
        System.out.println("No Command for execution.........!");
    }
}
