import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho da base do retângulo a ser calculado (cm):");
        double baseRetangulo = scanner.nextDouble();
        System.out.println("Agora digite a sua altura (cm):");
        double alturaRetangulo = scanner.nextDouble();
        double areaRetangulo = baseRetangulo * alturaRetangulo;
        System.out.println("A área do retângulo inserido é de " + areaRetangulo + " cm²");
    }
}