import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaBanco {
    private final static Scanner scanner = new Scanner(System.in);
    private final static DadosConta dadosConta = new DadosConta();
    private final static DadosInicialConta dadosInicialConta = new DadosInicialConta();


    public static void main(String[] args) {
        int option = -1;
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        criarUsuario();
        primeiroDeposito();
        do {
            System.out.println(dadosConta.getName() + ", escolha uma das funcionalidades abaixo:");
            System.out.println("1 - Consultar saldo da conta.");
            System.out.println("2 - Consultar saldo do cheque especial.");
            System.out.println("3 - Realizar depósito.");
            System.out.println("4 - Sacar dinheiro da conta.");
            System.out.println("5 - Pagar um boleto.");
            System.out.println("6 - Saldo total disponível (conta + cheque especial).");
            System.out.println("7 - Sair do aplicativo.");
            option = scanner.nextInt();

            switch (option){
                case 1 ->
            }

        }
        while (true);
    }

    public static void criarUsuario(){
        var name = "";
        while (name == null || name.isEmpty()){
            System.out.println("Olá, vamos começar o processo de abrir sua conta.\nPor favor insira o seu nome de usuário: ");
            name = scanner.nextLine();
        }
        var usuario = new Usuario(name);
        dadosConta.setName(String.valueOf(usuario));
    }

    public static void primeiroDeposito(){
        var depositoInicial = Double.parseDouble("");
        while (depositoInicial == 0){
            System.out.println("Para a criação da conta é necessário um depósito inicial.\nAgora " + dadosConta.getName() + ", insira o valor do seu depósito: ");
            depositoInicial = scanner.nextDouble();
        }
        var criterioCheque = new DadosInicialConta(depositoInicial);








        System.out.println("Bem vindo(a) " + dadosConta.getName() + ", sua conta foi criada com sucesso!\nSeu saldo inicial é de R$" + depositoInicial + "\nFoi também adicionado um valor de R$" + DadosConta.chequeEspecial() + " de cheque especial à sua conta.\nA utilização do cheque especial acarretará em uma taxa de 20% do valor utilizado.\nO valor da taxa será descontado no próximo depósito.");

    }

}
