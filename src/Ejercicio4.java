import java.util.List;

public class Ejercicio4 {
    static void main(String[] args) {
        List<Integer> numeros = List.of(10, 20, 30);

        double media = numeros.stream()
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();

        System.out.println(media);
    }
}
