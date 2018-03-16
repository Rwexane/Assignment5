package za.ac.cput.designpatterns.ChainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

public class FistYearSubjectHandler extends SubjectChain {

    private List<String> subjects = null;

    @Override
    public List<String> handleRequest(int request) {
        createSubject();
        if (request == 1) {
            return subjects;
        } else {
            return nextChain.handleRequest(request);
        }
    }

    public void createSubject() {
        subjects = new ArrayList<String>();

        subjects.add("Development Software 1");
        subjects.add("System Software 1");
        subjects.add("Information System 1");
        subjects.add("Information Technology Skill 1");
    }
}