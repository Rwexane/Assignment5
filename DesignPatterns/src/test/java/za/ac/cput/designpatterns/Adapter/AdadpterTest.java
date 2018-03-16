package za.ac.cput.designpatterns.Adapter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdadpterTest {

    SocketAdapter mySA1;
    SocketAdapter mySA2;
    Voltage myVolt1;
    Voltage myVolt2;

    @Before
    public void setUp() throws Exception {
        mySA1 = new SocketClassAdapter();
        myVolt1 = mySA1.get3Volt();
        mySA2 = new SocketObjectAdapter();
        myVolt2 = mySA2.get240Volt();
    }

    @Test
    public void testClassAdapter() throws Exception
    {
        int expected = 3;
        int actual = myVolt1.getVolts();
        assertEquals(expected, actual);
    }

    @Test
    public void testObjectAdapter() throws Exception
    {
        int expected = 240;
        int actual = myVolt2.getVolts();
        assertEquals(expected, actual);
    }
}
