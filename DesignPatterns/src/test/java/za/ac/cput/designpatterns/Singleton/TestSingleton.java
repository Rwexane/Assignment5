package za.ac.cput.designpatterns.Singleton;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestSingleton {

    Singleton singleton1;
    Singleton singleton2;

    @Before
    public void setUp() throws Exception {
        singleton1 = Singleton.getInstance();
        singleton2  = Singleton.getInstance();

    }


    @Test
    public void testName() throws Exception {
        Assert.assertEquals(singleton1, singleton2);

    }
}
