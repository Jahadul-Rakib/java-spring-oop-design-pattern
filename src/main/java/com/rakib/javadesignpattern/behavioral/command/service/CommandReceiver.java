package com.rakib.javadesignpattern.behavioral.command.service;

public class CommandReceiver {
    public void setCommand(Command command) {
        command.execute();
    }
}
