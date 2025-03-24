import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;



public class Nascimento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calendar calendar = GregorianCalendar.getInstance();
        System.out.println("Qual o seu nome?");
        var name = scanner.nextLine();
        System.out.println("Qual a sua data de Nascimento?");
        int anoNascimento = scanner.nextInt();
        int anoAtual = calendar.get(Calendar.YEAR);
        int idade = anoAtual - anoNascimento;
        System.out.println("Olá " + name + ", você tem " + idade + " anos.");
    }
}