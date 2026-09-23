import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio5 {
    static void main(String[] args) {
        List<String> nombres = List.of("Ana", "Luis", "Marta");

        String listado = nombres.stream()
                .collect(Collectors.joining(", "));
        System.out.println(listado);

        nombres.stream().forEach(System.out::println);
    }
}
