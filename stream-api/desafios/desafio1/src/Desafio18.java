import java.util.Arrays;
import java.util.List;
// Desafio 18 - Verifique se todos os números da lista são iguais:
public class Desafio18 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);

        boolean allEquals = numeros.stream().distinct().count() == 1;
        System.out.println("Todos os números da lista são iguais? " + allEquals);
    }
}
