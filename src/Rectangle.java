public class Rectangle extends Shape {
    // Els dos atributs amb '-' (privats) de la foto:
    private double l1;
    private double l2;

    // El constructor per donar-li valor a l1 i l2 (el necessites pel teu main: new Rectangle(5, 3))
    public Rectangle(double l1, double l2) {
        this.l1 = l1;
        this.l2 = l2;
    }

    // El mètode amb '+' (públic) de la foto:
    @Override
    public double area() {
        return l1 * l2;
    }
}
