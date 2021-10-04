import static java.lang.Math.PI;

public class WhiteCircle implements Circle{
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
        return this.radius * this.radius * PI;
    }

    @Override
    public double per() {
        return this.radius * PI * 2;
    }
}
