package com.rakib.javadesignpattern.behavioral.chain_of_responsiblity.service;

import com.rakib.javadesignpattern.behavioral.chain_of_responsiblity.service.service_impl.HandlerImplOne;
import com.rakib.javadesignpattern.behavioral.chain_of_responsiblity.service.service_impl.HandlerImplThree;
import com.rakib.javadesignpattern.behavioral.chain_of_responsiblity.service.service_impl.HandlerImplTwo;
import org.springframework.stereotype.Component;

@Component
public class ChainBaseHandler {

    public static void Chain() {
        HandlerImplOne chain1 = new HandlerImplOne();
        HandlerImplTwo chain2 = new HandlerImplTwo();
        HandlerImplThree chain3 = new HandlerImplThree();

        chain1.setNextHandler(chain2);
        chain2.setNextHandler(chain3);

        chain1.addCurrentHandlerName("RAKIB");
    }
}
