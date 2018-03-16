package za.ac.cput.designpatterns.Proxy;

import java.util.Date;

public abstract class Thing {

    public Date sayHello() {
        Date date = new Date();
        System.out.println(this.getClass().getSimpleName() + " says Te Te at " + date);
        return date;
    }
}
