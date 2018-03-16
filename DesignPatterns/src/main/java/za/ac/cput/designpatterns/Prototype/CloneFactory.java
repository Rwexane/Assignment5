package za.ac.cput.designpatterns.Prototype;

public class CloneFactory {

    public Student getClone( Student student){
        return student.makeCopy();
    }
}
