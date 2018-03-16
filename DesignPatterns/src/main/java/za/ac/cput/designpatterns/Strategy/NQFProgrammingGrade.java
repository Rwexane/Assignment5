package za.ac.cput.designpatterns.Strategy;

public class NQFProgrammingGrade implements Strategy {

    public String calculateGrade(double finalMark) {
        if(finalMark >= 50 && finalMark >= 50) {
            return "PASS";
        } else{
            return "FAIL";
        }
    }
}
