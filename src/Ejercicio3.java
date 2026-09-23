import java.util.List;

public class Ejercicio3 {
    static void main(String[] args) {
        List<Integer> numeros = List.of(10, 20, 30);

        int suma = numeros.stream()
                .reduce(0,Integer::sum);

        System.out.println(suma);
    }
}
