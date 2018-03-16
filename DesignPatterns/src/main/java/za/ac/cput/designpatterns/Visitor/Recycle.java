package za.ac.cput.designpatterns.Visitor;

public class Recycle implements Visitor {

    public String visit (Metal metal) {
        return "Metal PotMelter";
    }
    public String visit (Plastic plastic){
        return "Plastic Melt";
    }
    public String visit (Bottle bottle){
        return "Bottle Squash";
    }
}
