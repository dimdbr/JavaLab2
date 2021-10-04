public class WhiteTriangle implements Triangle{
    private double A;
    private double B;
    private double C;

    public WhiteTriangle(double a, double b, double c) {
        A = a;
        B = b;
        C = c;
    }

    public double getA() {
        return A;
    }

    public void setA(double a) {
        A = a;
    }

    public double getB() {
        return B;
    }

    public void setB(double b) {
        B = b;
    }

    public double getC() {
        return C;
    }

    public void setC(double c) {
        C = c;
    }

    @Override
    public double area() {
        double perim = this.per() / 2;
        return Math.sqrt(perim * (perim - this.A) * (perim - this.B) * (perim - this.C));
    }

    @Override
    public double per() {
        return this.A + this.B + this.C;
    }
}
