public abstract class Shape implements Comparable<Shape> {

    // El mètode abstracte de la capseta: + area(): double
    public abstract double area();

    // Obligatori en implementar la interfície Comparable (de la capseta blava)
    // Permet ordenar les figures comparant la seva àrea:
    @Override
    public int compareTo(Shape o) {
        return Double.compare(this.area(), o.area());
    }
}