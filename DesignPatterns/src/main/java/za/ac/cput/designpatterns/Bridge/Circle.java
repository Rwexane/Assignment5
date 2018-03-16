package za.ac.cput.designpatterns.Bridge;

public class Circle extends Shape {

    private int x, y, radius;

    protected Circle(Draw draw, int x, int y, int radius) {
        super(draw);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drowable.drawCircle(radius, x, y);
    }
}
