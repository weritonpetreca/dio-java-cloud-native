import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ParOuImpar {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Olá, você precisa digitar dois números crescentes.\nA partir deles,  indicar se deseja que seja retornado todos os valores  pares ou ímpares entre eles.\nVamos começar? Insira o primeiro número: ");
        int primeiroNumero = scanner.nextInt();
        int segundoNumero = 0;
        do {
            try {
                System.out.println("Agora insira um segundo número (Deve ser maior que o primeiro): ");
                segundoNumero = scanner.nextInt();
                verificadorNumeros(primeiroNumero, segundoNumero);
            } catch (ArithmeticException e) {
                System.out.println("O segundo número digitado deve ser maior que o primeiro, tente novamente");
            }
        }
        while (segundoNumero <= primeiroNumero);
    }

    public static void verificadorNumeros(int primeiroNumero, int segundoNumero) throws ArithmeticException {
        if (segundoNumero > primeiroNumero) {
            System.out.println("Dentro do intervalo de valores entre os dois números digitados, digite P para ver os números pares, ou I para ver os números ímpares:");
            String parImpar = scanner.next().toUpperCase();
            new EvenOdd(primeiroNumero, segundoNumero, parImpar);
        } else throw new ArithmeticException();
    }
}