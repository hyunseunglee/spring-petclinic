package org.springframework.samples.petclinic.proxy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StoreTest {

    @Test
    public void  testPay(){
        Payment cachPerf = new CashPerf();
        Store store = new Store(cachPerf);
        store.buySomething(100);

    }

}
