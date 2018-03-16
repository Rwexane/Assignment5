package za.ac.cput.designpatterns.ChainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

public class SecondYearSubjectHandle extends SubjectChain {

    private List<String> subjects = null;

    @Override
    public List<String> handleRequest(int request) {
        createSubject();
        if(request == 2) {
            return subjects;
        } else { return nextChain.handleRequest(request); }
    }

    public void createSubject(){
        subjects = new ArrayList<String>();

        subjects.add("Development Software 2");
        subjects.add("Internet Programming 1");
        subjects.add("Information System 2");
        subjects.add("Technical Programming 1");
    }
}
