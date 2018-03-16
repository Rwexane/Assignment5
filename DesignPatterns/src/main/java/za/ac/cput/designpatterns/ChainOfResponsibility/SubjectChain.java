package za.ac.cput.designpatterns.ChainOfResponsibility;

import java.util.List;

public abstract class SubjectChain implements Chain {

    SubjectChain nextChain;

    public void setNextChain(SubjectChain nextChain) {
        this.nextChain = nextChain;
    }
    public abstract List<String> handleRequest(int request);
}
