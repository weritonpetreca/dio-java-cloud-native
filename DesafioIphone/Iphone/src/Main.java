import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        Iphone iphone = new Iphone();

        System.out.println("Bem-vindo à loja iPhone!\nVamos customizar seu iPhone!\nDas opções abaixo, digite o número do modelo você deseja?");

        int option;

        do { 
            System.out.println("1. iPhone 14\n2. iPhone 14 Pro\n3. iPhone 14 Pro Max\n4. iPhone 15\n5. iPhone 15 Pro\n6. iPhone 15 Pro Max");

            option = scanner.nextInt();
                switch (option) {
                case 1 -> { System.out.println("Você escolheu o iPhone 14.");
                            iphone.setModelo("iPhone 14");}
                case 2 -> { System.out.println("Você escolheu o iPhone 14 Pro.");
                            iphone.setModelo("iPhone 14 Pro");}
                case 3 -> { System.out.println("Você escolheu o iPhone 14 Pro Max.");
                            iphone.setModelo("iPhone 14 Pro Max");}
                case 4 -> { System.out.println("Você escolheu o iPhone 15.");
                            iphone.setModelo("iPhone 15");}
                case 5 -> { System.out.println("Você escolheu o iPhone 15 Pro.");
                            iphone.setModelo("iPhone 15 Pro");}
                case 6 -> { System.out.println("Você escolheu o iPhone 15 Pro Max.");
                            iphone.setModelo("iPhone 14 Pro Max");}
                default -> System.out.println("Modelo inválido! Tente novamente.");
            } 
        } while (option < 1 || option > 6);
            
        System.out.println("Agora, vamos escolher a cor do seu iPhone.\nDigite o número da cor correspondente que você deseja?");

        do { 
            System.out.println("1. Preto\n2. Branco\n3. Azul\n4. Vermelho\n5. Verde\n6. Rosa");
            option = scanner.nextInt();
            switch (option) {
                case 1 -> { System.out.println("Você escolheu a cor Preto.");
                            iphone.setCor("Preto");}
                case 2 -> { System.out.println("Você escolheu a cor Branco.");
                            iphone.setCor("Branco");}
                case 3 -> { System.out.println("Você escolheu a cor Azul.");
                            iphone.setCor("Azul");}
                case 4 -> { System.out.println("Você escolheu a cor Vermelho.");
                            iphone.setCor("Vermelho");}
                case 5 -> { System.out.println("Você escolheu a cor Verde.");
                            iphone.setCor("Verde");}
                case 6 -> { System.out.println("Você escolheu a cor Rosa.");
                            iphone.setCor("Rosa");}
                default -> System.out.println("Cor inválida! Tente novamente.");
            }
        } while (option < 1 || option > 6);

        
        System.out.println("Agora, vamos escolher o sistema operacional do seu iPhone.\nDigite o número correspondente do sistema operacional que você deseja?");

        do { 
            System.out.println("1. iOS 16\n2. iOS 17\n3. iOS 18\n4. iOS 19\n5. iOS 20\n6. iOS 21");

           option = scanner.nextInt();     
            switch (option) {
                case 1 -> { System.out.println("Você escolheu o iOS 16.");
                            iphone.setSistemaOperacional("iOS 16");}
                case 2 -> { System.out.println("Você escolheu o iOS 17.");
                            iphone.setSistemaOperacional("iOS 17");}
                case 3 -> { System.out.println("Você escolheu o iOS 18.");
                            iphone.setSistemaOperacional("iOS 18");}
                case 4 -> { System.out.println("Você escolheu o iOS 19.");
                            iphone.setSistemaOperacional("iOS 19");}
                case 5 -> { System.out.println("Você escolheu o iOS 20.");
                            iphone.setSistemaOperacional("iOS 20");}
                case 6 -> { System.out.println("Você escolheu o iOS 21.");
                            iphone.setSistemaOperacional("iOS 21");}
                default ->System.out.println("Sistema operacional inválido! Tente novamente.");
            }
        } while (option < 1 || option > 6);

        
        
        System.out.println("Seu iPhone foi customizado com sucesso!\nModelo: " + iphone.getModelo() + "\nCor: " + iphone.getCor() + "\nSistema Operacional: " + iphone.getSistemaOperacional());
        System.out.println("Agora, vamos para o menu principal do iPhone.");

        do {
            System.out.println("Selecione uma opção:");
            System.out.println("1. Painel de Chamadas");
            System.out.println("2. Reprodutor de Mídia");
            System.out.println("3. Navegador de Internet");
            System.out.println("4. Exibir Mapa");
            System.out.println("5. Informações do Sistema");
            System.out.println("6. Desligar iPhone");

            option = scanner.nextInt();

            switch (option) {
                case 1 -> iphone.telefone();
                case 2 -> iphone.reprodutorMidia();
                case 3 -> iphone.navegadorInternet();
                case 4 -> iphone.maps();
                case 5 -> iphone.infoSistema();
                case 6 -> {
                    System.out.println("Desligando...");
                    System.exit(0);
                }
                default -> System.out.println("Opção inválida!");
            }
        } while (true);
    }
}
