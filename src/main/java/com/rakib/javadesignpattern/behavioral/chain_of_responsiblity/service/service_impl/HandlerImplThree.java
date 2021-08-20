package com.rakib.javadesignpattern.behavioral.chain_of_responsiblity.service.service_impl;

import com.rakib.javadesignpattern.behavioral.chain_of_responsiblity.service.HandlerChain;
import org.springframework.stereotype.Component;

@Component
public class HandlerImplThree implements HandlerChain {

    private HandlerChain handler;

    @Override
    public void setNextHandler(HandlerChain nextHandler) {
        this.handler = nextHandler;
    }

    @Override
    public void addCurrentHandlerName(String name) {
        System.out.println(name + " , handler-three");
        this.handler.addCurrentHandlerName("Call From three");
    }
}
