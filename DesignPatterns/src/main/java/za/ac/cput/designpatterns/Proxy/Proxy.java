package za.ac.cput.designpatterns.Proxy;

import java.util.Date;

public class Proxy {

    SlowThing slowThing;

    public Proxy() {
    }

    public Date sayHello() {
        if (slowThing == null) {
            slowThing = new SlowThing();
        }
        return slowThing.sayHello();
    }
}
