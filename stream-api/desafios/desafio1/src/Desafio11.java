import java.util.Arrays;
import java.util.List;
// Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:
public class Desafio11 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // int sumSquares = numeros.stream().map(n -> n * n).reduce(0, (a, b) -> a + b);
        int sumSquares = numeros.stream().mapToInt(n -> n * n).sum();
        System.out.println("Soma dos quadrados: " + sumSquares);
    }
}
