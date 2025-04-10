package map.OperacoesBasicas;

public class Main {
    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("João", 1234);
        agendaContatos.adicionarContato("Maria", 5678);
        agendaContatos.adicionarContato("João Pedro", 9012);
        agendaContatos.adicionarContato("Ana Maria", 3456);
        agendaContatos.adicionarContato("Carl", 7890);
        agendaContatos.adicionarContato("Carl", 3214);// Adicionando um contato duplicado

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Maria"));
        System.out.println(agendaContatos.pesquisarPorNome("João"));

        agendaContatos.removerContato("Ana");
        agendaContatos.removerContato("Carl");

        agendaContatos.exibirContatos();


        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Java", "Linguagem de programação");
        dicionario.adicionarPalavra("Programação", "Atividade de aprender e criar algo");
        dicionario.adicionarPalavra("Linguagem", "Conjunto de regras de sintaxe e semântica");
        dicionario.adicionarPalavra("Sintaxe", "Regras de como o programa deve ser escrito");
        dicionario.adicionarPalavra("Semântica", "Regras de como o programa deve ser interpretado");
        dicionario.adicionarPalavra("Java", "Linguagem de programação sendo estudada no momento"); // Adicionando uma palavra duplicada

        dicionario.exibirPalavras();

        System.out.println(dicionario.pesquisarPorPalavra("Java"));

        dicionario.removerPalavra("Java");
        dicionario.removerPalavra("Python"); // Tentativa de remover uma palavra que não existe

        dicionario.exibirPalavras();


        

    }
}
