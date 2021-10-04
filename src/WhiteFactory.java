public class WhiteFactory extends BaseFactory{

    @Override
    public Circle createCircle(double r) {
        return new WhiteCircle(r);
    }

    @Override
    public Triangle createTriangle(double a, double b, double c) {
        return new WhiteTriangle(a, b, c);
    }
}
