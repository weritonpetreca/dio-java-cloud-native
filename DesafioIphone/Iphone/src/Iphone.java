
import java.util.Scanner;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet, Maps{
    private String modelo;
    private String cor;
    private String sistemaOperacional;
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void tocar() {
        System.out.println("Tocando música no iPhone.");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada no iPhone.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }


    public void reprodutorMidia() {
        int opcao;
        do{
            System.out.println("Reprodutor de mídia do iPhone.\nO que deseja fazer?");
            System.out.println("1. Tocar música\n2. Pausar música\n3. Selecionar música\n4. Voltar ao menu principa do Iphone");	
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1 -> tocar();
                case 2 -> pausar();
                case 3 -> {System.out.println("Digite o nome da música:");
                            scanner.nextLine();
                            String musica = scanner.nextLine();
                            selecionarMusica(musica);
                        }
                case 4 -> System.out.println("Voltando ao menu principal.");
                default -> System.out.println("Opção inválida!");
            }
        } while(opcao != 4);
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no navegador.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página no navegador.");
    }

    public void navegadorInternet() {
        int opcao;
        do{
            System.out.println("Navegador de internet do iPhone.\nO que deseja fazer?");
            System.out.println("1. Inserir URL da página\n2. Adicionar nova aba em branco\n3. Atualizar página atual\n4. Voltar ao menu principa do Iphone");	
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1 -> {System.out.println("Digite a URL da página:");
                            String url = scanner.next();
                            exibirPagina(url);}
                case 2 -> adicionarNovaAba();
                case 3 -> atualizarPagina();
                case 4 -> System.out.println("Voltando ao menu principal.");
                default -> System.out.println("Opção inválida!");
            }
        } while(opcao != 4);    
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    public void telefone() {
        int opcao;
        do{
            System.out.println("Telefone do iPhone.\nO que deseja fazer?");
            System.out.println("1. Ligar\n2. Atender\n3. Iniciar correio de voz\n4. Voltar ao menu principa do Iphone");	
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1 -> {System.out.println("Digite o telefone:");
                            String numero = scanner.next();
                            ligar(numero);}
                case 2 -> atender();
                case 3 -> iniciarCorreioVoz();
                case 4 -> System.out.println("Voltando ao menu principal.");
                default -> System.out.println("Opção inválida!");
            }
        } while(opcao != 4);
    }

    @Override
    public void exibirMapa(String localizacao) {
        System.out.println("Exibindo mapa da localização: " + localizacao);
    }

    @Override
    public void obterDirecoes(String origem, String destino) {
        System.out.println("Obtendo direções de " + origem + " para " + destino);
    }

    @Override
    public void buscarPontosInteresse(String localizacao, String tipo) {
        System.out.println("Buscando pontos de interesse do tipo " + tipo + " na localização: " + localizacao);
    }
    
    public void maps() {
        int opcao;
        do{
            System.out.println("Maps do iPhone.\nO que deseja fazer?");
            System.out.println("1. Exibir mapa\n2. Obter direções\n3. Buscar pontos de interesse\n4. Voltar ao menu principa do Iphone");	
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1 -> { System.out.println("Digite a localização:");
                            scanner.nextLine();
                            String localizacao = scanner.nextLine();
                            exibirMapa(localizacao);}
                case 2 -> { System.out.println("Digite a origem:");
                            scanner.nextLine();
                            String origem = scanner.nextLine();
                            System.out.println("Digite o destino:");
                            String destino = scanner.nextLine();
                            obterDirecoes(origem, destino);}
                case 3 -> { System.out.println("Digite a localização:");
                            scanner.nextLine();
                            String localizacao = scanner.nextLine();
                            System.out.println("Digite o tipo de ponto de interesse:");
                            String tipo = scanner.nextLine();
                            buscarPontosInteresse(localizacao, tipo);}
                case 4 -> System.out.println("Voltando ao menu principal.");
                default -> System.out.println("Opção inválida!");
            }
        } while(opcao != 4);
    }

    public void infoSistema() {
        System.out.println("Seu aparelho é do modelo " + modelo + ", da cor " + cor + " e com o sistema operacional " + sistemaOperacional + ".");
    }

    
}