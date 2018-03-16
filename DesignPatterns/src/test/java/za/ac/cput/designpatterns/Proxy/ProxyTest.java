package za.ac.cput.designpatterns.Proxy;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.Date;

public class ProxyTest {

    public ProxyTest() {
    }

    @Test
    public void testThing() {

        Date testDate, fastDate, slowDate;

        FastThing fastThing = new FastThing();
        fastDate = fastThing.sayHello();
        testDate = new Date();
        Assert.assertEquals(fastDate.toString(), testDate.toString(), "Test failed: FastThing");

        SlowThing slowThing = new SlowThing();
        slowDate = slowThing.sayHello();
        testDate = new Date();
        Assert.assertEquals(slowDate.toString(), testDate.toString(), "Test failed: SlowThing");
    }
}
