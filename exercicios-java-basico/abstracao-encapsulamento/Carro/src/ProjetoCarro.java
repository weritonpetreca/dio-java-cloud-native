import java.util.Scanner;

public class ProjetoCarro {
    public static void main(String[] args) throws Exception {
    int opcao;
        Scanner scanner = new Scanner(System.in);
        Carro carro = new Carro();
        System.out.println("Você acaba de entrar no carro.\nO carro está desligado.");
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
                case 1 -> carro.ligar();
                case 2 -> carro.desligar();
                case 3 -> carro.acelerar();
                case 4 -> carro.desacelerar();
                case 5 -> carro.virar();
                case 6 -> carro.verificarStatus();
                case 7 -> carro.trocarMarcha();
                case 8 -> {
                    System.out.println("Saindo do carro.");
                    scanner.close();
                    System.exit(0);
                }
                    default -> System.out.println("Opção inválida.");
                }
        } while (true);
    }  
}   
