import java.util.Arrays;
import java.util.List;
// Desafio 17 - Filtrar os números primos da lista:
public class Desafio17 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> primos = numeros.stream()
                .filter(Desafio17::isPrimo)
                .toList();

        System.out.println("Números primos: " + primos);
    }

    public static boolean isPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
