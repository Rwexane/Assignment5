package za.ac.cput.designpatterns.Prototype;

public class UniversityStudent implements Student {

    private String tname = "University";

    public UniversityStudent(){

    }

    public String getThename() {
        return tname;
    }

    public Student makeCopy(){
        UniversityStudent student = null;

        try {
            student = (UniversityStudent) super.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return  student;

    }
}
