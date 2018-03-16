package za.ac.cput.designpatterns.ChainOfResponsibility;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestChainOfResponsibility {

    List<String> response = new ArrayList<String>();

    private SubjectChain firstYear;
    private SubjectChain secondYear;
    private SubjectChain thirdYear;

    @Before
    public void setUp() throws Exception {
        firstYear = new FistYearSubjectHandler();
        secondYear = new SecondYearSubjectHandle();
        thirdYear = new ThirdYearSubjectHandler();

        firstYear.setNextChain(secondYear);
        secondYear.setNextChain(thirdYear);
    }

    @Test
    public void testName() throws Exception {
        response = (( SubjectChain)firstYear).handleRequest(3);
        Assert.assertEquals(true, response.contains("Technical Programming 2"));
    }

    @Test
    public void testEndOfChain() throws Exception {
        response = (( SubjectChain)firstYear).handleRequest(5);
        Assert.assertEquals(null, response);

    }
}
