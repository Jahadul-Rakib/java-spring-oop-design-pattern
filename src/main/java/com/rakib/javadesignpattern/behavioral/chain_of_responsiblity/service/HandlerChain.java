package com.rakib.javadesignpattern.behavioral.chain_of_responsiblity.service;

public interface HandlerChain {
    void setNextHandler(HandlerChain nextHandler);
    void addCurrentHandlerName(String name);
}
