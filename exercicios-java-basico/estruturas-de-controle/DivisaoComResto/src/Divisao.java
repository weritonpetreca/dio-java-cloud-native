import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Divisao {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Vamos inserir ao menos dois números, sendo do segundo em diante maiores que o primeiro.\nEnquanto os números digitados forem divisões exatas pelo primeiro, será necessário digitar outro.\nVamos começar? Digite o primeiro número: ");
        int primeiroNumero = scanner.nextInt();
        int proximoNumero = primeiroNumero - 1;
        do {
            try {
                System.out.println("Digite o próximo número: ");
                proximoNumero = scanner.nextInt();
                checkNumber(primeiroNumero, proximoNumero);
            } catch (ArithmeticException e) {
                System.out.println("O número digitado deve ser maior que " + primeiroNumero + ".");
            }
        } while (proximoNumero <= primeiroNumero);
    }

    public static void checkNumber(int primeiroNumero, int proximoNumero) throws ArithmeticException {
        if (proximoNumero <= primeiroNumero) {
            throw new ArithmeticException();
        } else {
            new CheckDivision(primeiroNumero, proximoNumero);
        }
    }
}