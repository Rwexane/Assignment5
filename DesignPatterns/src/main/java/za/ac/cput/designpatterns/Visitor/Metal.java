package za.ac.cput.designpatterns.Visitor;

public class Metal implements Visitable {

    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
