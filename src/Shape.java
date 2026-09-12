public abstract class Shape implements Comparable<Shape> {
    // La classe Shape, ens permet comparar figures distintes, ja que
    // el programa distingeix entre classes, i si les agrupam dins un mateix paraigües
    public abstract double area();

    // Permet ordenar les figures comparant la seva àrea:
    @Override
    public int compareTo(Shape o) {
        return Double.compare(this.area(), o.area());
    }
}