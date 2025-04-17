import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Desafio 7 - Encontrar o segundo número maior da lista:

public class Desafio7 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int segundoMaior = (int) numeros.stream().sorted().distinct().sorted(Comparator.reverseOrder())
                .skip(1).findFirst().orElseThrow(() -> new RuntimeException("Não há segundo maior número."));
        // O método sorted() ordena os números, distinct() remove duplicatas, sorted(Comparator.reverseOrder()) ordena em ordem decrescente, skip(1) pula o maior número e findFirst() pega o primeiro número restante.

        System.out.println("Segundo número maior: " + segundoMaior);
    }
}
