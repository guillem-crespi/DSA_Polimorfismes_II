public class TriangleEQ extends Shape {
    private double b;
    private double h;

    public TriangleEQ(double b, double h) {
        this.b = b;
        this.h = h;
    }

    @Override
    public double area() {
        return (b * h) / 2.0;
    }

    @Override
    public String toString() {
        return "TriangleEQ [b=" + b + ", h=" + h + ", area=" + area() + "]";
    }
}