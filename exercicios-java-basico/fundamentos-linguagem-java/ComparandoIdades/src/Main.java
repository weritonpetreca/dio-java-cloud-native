import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);
        Calendar calendar = GregorianCalendar.getInstance();
        System.out.println("Qual o seu nome? ");
        String nameOne = scanner.nextLine();
        System.out.println("Qual ano você nasceu?");
        int yearOne = Integer.parseInt(scanner.nextLine());
        System.out.println("Qual o nome do seu amigo?");
        String nameTwo = scanner.nextLine();
        System.out.println("Qual ano ele nasceu?");
        int yearTwo = scanner.nextInt();
        int currentYear = calendar.get(Calendar.YEAR);
        int oldOne = currentYear - yearOne;
        int oldTwo = currentYear - yearTwo;
        int yearDif = Math.abs(oldOne - oldTwo);
        System.out.println("Olá, " + nameOne + " e " + nameTwo + ", a diferença de idade entre vocês é de " + yearDif + " anos.");
        scanner.close();
    }
}