package za.ac.cput.designpatterns.Strategy;

public class NSCMathLiteracyGrade implements Strategy {

    public String calculateGrade(double finalMark) {
        if (finalMark >= 40){
            return "PASS";
        } else {
            return "FAIL";
        }
    }
}
