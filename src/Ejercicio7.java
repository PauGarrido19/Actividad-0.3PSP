import java.util.Comparator;
import java.util.List;

public class Ejercicio7 {
    static void main(String[] args) {
        List<String> estrellas_satelites = List.of("sol", "luna", "estrella", "cometa");

        List ordenados = estrellas_satelites.stream()
                .sorted(Comparator.comparing(String::length))
                .toList();

        System.out.println(ordenados);
    }
}
