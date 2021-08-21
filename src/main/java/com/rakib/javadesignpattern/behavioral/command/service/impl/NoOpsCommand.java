package com.rakib.javadesignpattern.behavioral.command.service.impl;

import com.rakib.javadesignpattern.behavioral.command.service.ICommand;
import org.springframework.stereotype.Component;

@Component
public class NoOpsCommand implements ICommand {

    @Override
    public void execute() {
        System.out.println("No Command for execution.........!");
    }
}
