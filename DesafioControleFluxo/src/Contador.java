import java.util.Scanner;
public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor inicial: ");
        int valorInicial = scanner.nextInt();
        System.out.println("Digite o valor final: ");
        int valorFinal = scanner.nextInt();

        try {
            contador(valorInicial, valorFinal);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O valor final deve ser maior que o valor inicial.");
        } finally {
            scanner.close();
        }
    }

    public static void contador(int valorInicial, int valorFinal) throws ParametrosInvalidosException {
        if (valorFinal <= valorInicial) {
            throw new ParametrosInvalidosException();
        }

        int contagem = valorFinal - valorInicial;
        for (int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo o número: " + (i + 1));
        }
    }
}
