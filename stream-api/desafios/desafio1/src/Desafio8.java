import java.util.Arrays;
import java.util.List;

// Desafio 8 - Somar os dígitos de todos os números da lista:
public class Desafio8 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaValores = numeros.stream().reduce(0, (a, b) -> a + b);
        System.out.println("Soma dos números: " + somaValores);
    }
}
