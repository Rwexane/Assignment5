package za.ac.cput.designpatterns.ChainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

public class ThirdYearSubjectHandler extends SubjectChain {

    private List<String> subjects = null;
    @Override
    public List<String> handleRequest(int request) {
        createSubject();
        if(request == 3) {
            return subjects;
        } else { return null; }
    }

    public void createSubject(){
        subjects = new ArrayList<String>();

        subjects.add("Development Software 3");
        subjects.add("Internet Programming 2");
        subjects.add("Information System 3");
        subjects.add("Technical Programming 2");
    }
}
