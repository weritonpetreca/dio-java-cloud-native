import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá! Vamos calculuar seu IMC. Primeiro, informe seu peso (Kg): ");
        double weight = scanner.nextDouble();
        System.out.println("Muito bem! Agora, informe a sua altura (m): ");
        double heigh = scanner.nextDouble();
        new IMC(weight, heigh);
    }
}