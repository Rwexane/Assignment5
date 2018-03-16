package za.ac.cput.designpatterns.Visitor;

public interface Visitor {

    public String visit (Metal metal);
    public String visit (Plastic plastic);
    public String visit (Bottle bottle);
}
