import java.util.Comparator;
import java.util.List;

public class Ejercicio8 {
    static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5);

        List<Integer> invertida = numeros.stream()
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println(invertida);
    }
}
