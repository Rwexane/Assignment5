package za.ac.cput.designpatterns.Visitor;

public class Plastic implements Visitable {

    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
