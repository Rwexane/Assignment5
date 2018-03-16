package za.ac.cput.designpatterns.Visitor;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestVisitor {

    Recycle visitor = new Recycle();

    Visitable bottle = new Bottle();
    Visitable plastic = new Plastic();
    Visitable metal = new Metal();
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testBottle() throws Exception {

        Assert.assertEquals("Bottle Squash",bottle.accept(visitor));
        System.out.println(plastic.accept(visitor));
        System.out.println(metal.accept(visitor));

    }
    @Test
    public void testMetal() throws Exception {

        Assert.assertEquals("Plastic Melt",plastic.accept(visitor));

    }
    @Test
    public void testPlastic() throws Exception {

        Assert.assertEquals("Metal PotMelter",metal.accept(visitor));

    }
}
