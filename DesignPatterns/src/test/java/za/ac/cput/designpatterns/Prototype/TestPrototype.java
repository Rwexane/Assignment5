package za.ac.cput.designpatterns.Prototype;

import org.junit.Assert;
import org.junit.Test;

public class TestPrototype {

    CloneFactory university = new CloneFactory();
    UniversityStudent  std = new UniversityStudent();
    UniversityStudent p = new UniversityStudent();

    @Test
    public void testName() throws Exception {

        p = (UniversityStudent) university.getClone(std);

        Assert.assertEquals(std.getThename(), std.getThename());
    }
}
