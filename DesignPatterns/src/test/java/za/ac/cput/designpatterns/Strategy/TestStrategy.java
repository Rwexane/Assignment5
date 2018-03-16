package za.ac.cput.designpatterns.Strategy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestStrategy {

    StrategyContext contextNSC;
    StrategyContext contextNQF;

    @Before
    public void setUp() throws Exception {
        contextNSC = new StrategyContext(new NSCMathLiteracyGrade());
        contextNQF = new StrategyContext(new NQFProgrammingGrade());
    }

    @Test
    public void testNQF() throws Exception {
        Assert.assertEquals("PASS", contextNQF.executeStrategy(99.99));
    }

    @Test
    public void testNSC() throws Exception {
        Assert.assertEquals("PASS", contextNSC.executeStrategy(99.99));
    }
}
