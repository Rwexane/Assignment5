package za.ac.cput.designpatterns.Bridge;

public abstract class Shape {

    protected Draw drowable;

    protected Shape( Draw draw){
        this.drowable = draw;
    }

    public abstract void draw();
}
