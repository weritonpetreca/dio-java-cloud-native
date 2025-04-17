import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
// Desafio 13 - Filtrar os números que estão dentro de um intervalo:
public class Desafio13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.print("Digite o valor inicial do intervalo: ");
        int valorInicial = scanner.nextInt();
        System.out.print("Digite o valor final do intervalo: ");
        int valorFinal = scanner.nextInt();

        //numeros.stream().filter(n -> n >= valorInicial && n <= valorFinal).forEach(System.out::println);

        List<Integer> intervalNumbers = numeros.stream().filter(n -> n >= valorInicial && n <= valorFinal).collect(Collectors.toList());

        System.out.println("Números dentro do intervalo: " + valorInicial + " e " + valorFinal + " são: " + intervalNumbers);
    }
}
