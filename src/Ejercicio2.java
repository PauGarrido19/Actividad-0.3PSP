import java.util.List;

public class Ejercicio2 {
    static void main(String[] args) {
        List<String> frutas = List.of("banana", "manzana", "cereza");

        List<String> ordenadas = frutas.stream()
                .sorted()
                .toList();

        System.out.println(ordenadas);
    }
}
