import java.util.List;

public class Ejercicio6 {
    static void main(String[] args) {
        List<String> estrellas_satelites = List.of("sol", "luna", "estrella", "cometa");

        List<Integer> longitud = estrellas_satelites.stream()
                .map(String::length)
                .toList();

        System.out.println(longitud);
    }
}
