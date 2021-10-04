public class BlackFactory extends  BaseFactory{
    @Override
    public Circle createCircle(double r) {
        return new BlackCircle(r);
    }

    @Override
    public Triangle createTriangle(double a, double b, double c) {
        return new BlackTriangle(a, b, c);
    }
}
