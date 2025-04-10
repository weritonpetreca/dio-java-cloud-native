package set.Pesquisa;

public class Main {
    public static void main(String[] args) {
        
        AgendaContatos agendaContatos = new AgendaContatos();
        
        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("João", 1234);
        agendaContatos.adicionarContato("Maria", 5678);
        agendaContatos.adicionarContato("João Pedro", 9012);
        agendaContatos.adicionarContato("Ana Maria", 3456);
        agendaContatos.adicionarContato("Carl", 7890);
        agendaContatos.adicionarContato("Carl", 3214);// Adicionando um contato duplicado
        
        agendaContatos.exibirContatos();
        
        System.out.println(agendaContatos.pesquisarPorNome("Maria"));
        System.out.println(agendaContatos.pesquisarPorNome("João"));
        
        agendaContatos.atualizarNumeroContato("Carl", 1111);
        
        agendaContatos.exibirContatos();


        ListaTarefas listaTarefas = new ListaTarefas();
        
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer compras");
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Varrer a casa");
        listaTarefas.adicionarTarefa("Fazer almoço");
        listaTarefas.adicionarTarefa("Lavar louça");

        listaTarefas.exibirTarefas();
        
        System.out.println("Total de tarefas: " + listaTarefas.contarTarefas());
        
        listaTarefas.removerTarefa("Fazer compras");
        
        System.out.println("Total de tarefas: " + listaTarefas.contarTarefas());

        listaTarefas.exibirTarefas();

        System.out.println("Tarefas concluídas: " + listaTarefas.obterTarefasConcluidas());

        System.out.println("Tarefas pendentes: " + listaTarefas.obterTarefasPendentes());
        
        listaTarefas.marcarTarefaConcluida("Estudar Java");
        listaTarefas.marcarTarefaConcluida("Varrer a casa");
        
        System.out.println("Tarefas concluídas: " + listaTarefas.obterTarefasConcluidas());

        System.out.println("Tarefas pendentes: " + listaTarefas.obterTarefasPendentes());
        
        listaTarefas.marcarTarefaPendente("Estudar Java");
        
        System.out.println("Tarefas concluídas: " + listaTarefas.obterTarefasConcluidas());

        System.out.println("Tarefas pendentes: " + listaTarefas.obterTarefasPendentes());

        listaTarefas.limparListaTarefas();

        listaTarefas.exibirTarefas();
    }
}
