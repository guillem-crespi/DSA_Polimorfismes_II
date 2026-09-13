import java.util.Arrays;
public class GestorFiguras {
    // Método para sumar el área de todas las figuras del array
    public static double sum(Shape[] v) {
        double res = 0;
        for (Shape s : v) {
            res += s.area();
        }
        return res;
    }

    // Método para ordenar las figuras de menor a mayor según su área
    public static void sort(Shape[] v) {
        Arrays.sort(v);
    }

    // Método para imprimir por pantalla el listado de figuras
    public static void print(Shape[] v) {
        for (Shape s : v) {
            System.out.println(s);
        }
    }

    // Método main: se ejecuta la prueba del programa
    public static void main(String[] args) {
        Shape[] v = new Shape[4];

        v[0] = new Rectangle(5, 3);
        v[1] = new Circle(5);
        v[2] = new Square(5);
        v[3] = new TriangleEQ(4, 2);

        // Cálculo de la suma de las áreas
        double res = sum(v);
        System.out.println("sum: " + res);

        // 2. Mostrar las figuras sin ordenar
        System.out.println("\n Lista sin ordenar ");
        print(v);

        // 3. Ordenar las figuras por área, de menos a más
        sort(v);

        // 4. Mostrar las figuras ordenadas
        System.out.println("\n Lista ordenada por área");
        print(v);
    }
}
