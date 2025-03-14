import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Por favor, digite o número da sua Conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência :");
        String numeroAgencia = scanner.next();

        scanner.nextLine();

        System.out.println("Por favor, confirme o nome do titular da Conta :");
        String nomeTitular = scanner.nextLine();

        System.out.println("Qual será o valor do depósito inicial? :");
        double saldoInicial =scanner.nextDouble();

        System.out.println("Olá " + nomeTitular + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldoInicial + " já está disponível para saque");
    }
}
