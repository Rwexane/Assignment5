package za.ac.cput.designpatterns.AbstractFactory;

import org.junit.Assert;
import org.junit.Test;

public class TestAbstractFactory {

    AbstractFactory sportFactory = FactoryProducer.getFactory("Sport");

    Sports football = sportFactory.getSport("Football");
    Sports cricket = sportFactory.getSport("Cricket");

    @Test
    public void testName() throws Exception {
        Assert.assertNotSame(football, cricket);

    }
}
