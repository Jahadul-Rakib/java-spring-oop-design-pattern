package com.rakib.javadesignpattern.behavioral.chain_of_responsiblity.service;

import com.rakib.javadesignpattern.behavioral.chain_of_responsiblity.service.service_impl.*;
import org.springframework.stereotype.Component;

@Component
public class ChainBaseHandler {

    public static void Chain() {
        HandlerImplOne chain1 = new HandlerImplOne();
        HandlerImplTwo chain2 = new HandlerImplTwo();
        HandlerImplThree chain3 = new HandlerImplThree();
        HandlerImplFour chain4 = new HandlerImplFour();
        HandlerImplFive chain5 = new HandlerImplFive();

        chain1.setNextHandler(chain2);
        chain2.setNextHandler(chain3);
        chain3.setNextHandler(chain4);
        chain4.setNextHandler(chain5);

        chain1.addCurrentHandlerName("RAKIB");
    }
}
