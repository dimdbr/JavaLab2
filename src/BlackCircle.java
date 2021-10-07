import static java.lang.Math.PI;

public class BlackCircle extends BlackFactory implements Circle{
    private final double radius;

    public BlackCircle(double radius) {
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
