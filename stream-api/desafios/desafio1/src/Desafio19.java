import java.util.Arrays;
import java.util.List;
// Desafio 19 - Encontre a soma dos números divisíveis por 3 e 5:
public class Desafio19 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int sumDivisible = numeros.stream()
                .filter(n -> n % 3 == 0 || n % 5 == 0)
                .mapToInt(n -> n)
                .sum();

        System.out.println("Soma dos números divisiveis por 3 ou 5: " + sumDivisible);
    }
}
