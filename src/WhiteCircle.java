import static java.lang.Math.PI;

public class WhiteCircle extends WhiteFactory implements Circle{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public WhiteCircle(double radius) {
        this.radius = radius;
    }


    @Override
    public double area() {
        return radius * radius * PI;
    }

    @Override
    public double circumference() {
        return radius * PI * 2;
    }
}
