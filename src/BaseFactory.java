public abstract class BaseFactory extends AbstractFactory {
    public abstract Circle createCircle(double r);
    public abstract Triangle createTriangle(double a, double b, double c);

    public static BaseFactory getFactory(int factoryColor)
    {
        switch (factoryColor)
        {
            case 1:
                return new BlackFactory();
            case 2:
                return new WhiteFactory();
            default: return new WhiteFactory();
        }
    }
}
