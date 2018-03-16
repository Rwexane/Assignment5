package za.ac.cput.designpatterns.Visitor;

public class Bottle implements Visitable {

    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
