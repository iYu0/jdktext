package com;

import impl.Superliu;
import org.junit.Test;
import proxy.Proxyfactory;
import service.Service;

public class Text {
    @Test
    public void Mytext(){
        Proxyfactory proxyfactory = new Proxyfactory(new Superliu());
        Service aengt = (Service) proxyfactory.aengt();
        aengt.sing();
    }
}
