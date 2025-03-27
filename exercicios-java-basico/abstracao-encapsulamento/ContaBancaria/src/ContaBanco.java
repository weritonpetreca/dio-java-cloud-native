import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaBanco {
    private final static Scanner scanner = new Scanner(System.in);
    private final static DadosConta dadosConta = new DadosConta();


    public static void main(String[] args) {
        
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        criarUsuario();
        primeiroDeposito();
        var menu = -1;
        do {
            System.out.println(dadosConta.getName() + ", escolha uma das funcionalidades abaixo:");
            System.out.println("1 - Consultar saldo da conta.");
            System.out.println("2 - Consultar saldo do cheque especial.");
            System.out.println("3 - Realizar depósito.");
            System.out.println("4 - Sacar dinheiro da conta.");
            System.out.println("5 - Pagar um boleto.");
            System.out.println("6 - Saldo total disponível (conta + cheque especial).");
            System.out.println("7 - Sair do aplicativo.");
            menu = scanner.nextInt();
            
            switch (menu){
                case 1 -> consultarSaldo();
                case 2 -> consultarChequeEspecial();
                case 3 -> realizarDeposito();
                case 4 -> sacarDinheiro();
                case 5 -> pagarBoleto();
                case 6 -> saldoTotalDisponivel();
                case 7 -> {
                    System.out.println("Obrigado por usar nosso aplicativo!");
                    System.exit(0);
                }
                default -> System.out.println("Opção inválida.");
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
        dadosConta.setName(usuario.getName());
    }

    public static void primeiroDeposito(){
        var depositoInicial = 0.0;
        while (depositoInicial == 0){
            System.out.println("Para a criação da conta é necessário um depósito inicial.\nAgora " + dadosConta.getName() + ", insira o valor do seu depósito: ");
            depositoInicial = scanner.nextDouble();
        }

        dadosConta.saldoInicial(depositoInicial);

        DadosInicialConta dadosInicialConta = new DadosInicialConta(depositoInicial);

        dadosInicialConta.calculoChequeEspecialInicial();

        double chequeEspecialInicial = dadosInicialConta.getchequeEspecialInicial();
        dadosConta.setChequeEspecialInicial(chequeEspecialInicial);

        dadosConta.setChequeEspecial(chequeEspecialInicial);

        System.out.println("Bem vindo(a) " + dadosConta.getName() + ", sua conta foi criada com sucesso!\nSeu saldo inicial é de R$" + depositoInicial + "\nFoi também adicionado um valor de R$" + chequeEspecialInicial + " de cheque especial à sua conta.\nA utilização do cheque especial acarretará em uma taxa de 20% do valor utilizado.\nO valor da taxa será descontado no próximo depósito.\n");
    }

    public static void consultarSaldo(){
        System.out.println("Seu saldo atual é de R$" + dadosConta.getSaldoConta());
    }

    public static void consultarChequeEspecial(){
        System.out.println("Seu cheque especial atual é de R$" + dadosConta.getChequeEspecial());
    }

    public static void realizarDeposito(){
        System.out.println("Insira o valor do depósito: ");
        double valorDeposito = scanner.nextDouble();
        dadosConta.depositar(valorDeposito);
    }

    public static void sacarDinheiro(){
        System.out.println("Insira o valor do saque: ");
        double valorSaque = scanner.nextDouble();
        dadosConta.sacar(valorSaque);
    }

    public static void pagarBoleto(){
        System.out.println("Insira o valor do boleto: ");
        double valorBoleto = scanner.nextDouble();
        dadosConta.pagarBoleto(valorBoleto);
    }

    public static void saldoTotalDisponivel(){
        System.out.println("Seu saldo total disponível é de R$" + (dadosConta.getSaldoConta() + dadosConta.getChequeEspecial()));
    }
}
