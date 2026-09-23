import java.util.List;

public class Ejercicio1 {
    static void main(String[] args) {
        List<String> nombres = List.of("Ana", "Luis", "Marta", "Pedro", "Eva");

        List<String> resultado = nombres.stream()
                .filter(n -> n.length() > 3)
                .map(String::toUpperCase)
                .toList();

        System.out.println(resultado);
    }
}
