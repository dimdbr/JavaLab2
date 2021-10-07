public class Main {
    public static void main(String[] args) {
        BaseFactory blackFactory = BaseFactory.getFactory(1);
        BaseFactory whiteFactory = BaseFactory.getFactory(2);
        Circle whiteCircle = whiteFactory.createCircle(2);
        Triangle blackTriangle = blackFactory.createTriangle(3,4,6);
        System.out.println("White circle area "+whiteCircle.area());
        System.out.println("White circle circumference "+whiteCircle.circumference());
        System.out.println("Black triangle area "+blackTriangle.area());
        System.out.println("Black triangle perimeter "+blackTriangle.perimeter());
        }
}
