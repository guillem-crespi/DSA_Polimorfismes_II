public class Rectangle extends Shape {
    // l1 --> Costat 1 l2 --> Costat 2
    private double l1;
    private double l2;

    // "El rectangle està format per l1 i l2
    public Rectangle(double l1, double l2) {
        this.l1 = l1;
        this.l2 = l2;
    }

    // Àrea rectangle = Costat·Costat
    @Override
    public double area() {
        return l1 * l2;
    }
}
