import java.util.Arrays;
import java.util.List;
// Desafio 16 - Agrupe os números em pares e ímpares
public class Desafio16 {
    
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> odd = numeros.stream().filter(n -> n % 2 != 0).toList();
        List<Integer> even = numeros.stream().filter(n -> n % 2 == 0).toList();

        System.out.println("Números pares: " + even);
        System.out.println("Números ímpares: " + odd);

    }
}
