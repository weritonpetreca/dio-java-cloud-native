
import java.util.Scanner;

public class ProjetoCarro {
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;
        do { 
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Ligar o carro.");
            System.out.println("2 - Desligar o carro.");
            System.out.println("3 - Acelerar o carro.");
            System.out.println("4 - Desacelerar o carro.");
            System.out.println("5 - Virar o carro.");
            System.out.println("6 - Verificar velocidade e marcha.");
            System.out.println("7 - Trocar de marcha.");
            System.out.println("8 - Sair do carro.");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> new Carro().ligar();
                case 2 -> new Carro().desligar();
                case 3 -> new Carro().acelerar();
                case 4 -> new Carro().desacelerar();
                case 5 -> new Carro().virar();
                case 6 -> new Carro().verificarVelocidade();
                case 7 -> new Carro().trocarMarcha();
                case 8 -> System.exit(0);
                default -> System.out.println("Opção inválida.");
            }
        } while (true);
    }

    public static void ligar() {
}
