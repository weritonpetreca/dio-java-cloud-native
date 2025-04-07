package lists.OperacoesBasicas;
public class Main {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        
        System.out.println("O número total de tarefas é: " + listaTarefas.obterNumeroTotalTarefas());
        
        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 2");
        
        System.out.println("O número total de tarefas é: " + listaTarefas.obterNumeroTotalTarefas());
        
        listaTarefas.removerTarefa("Tarefa 2");
        
        System.out.println("O número total de tarefas é: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.obterDescricoesTarefas();

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.exibirItems();
        
        carrinhoDeCompras.adicionarItem("Lápis", 2.50, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 15.00, 1);
        carrinhoDeCompras.adicionarItem("Caneta", 1.50, 5);
        carrinhoDeCompras.adicionarItem("Borracha", 0.75, 2);
        carrinhoDeCompras.adicionarItem("Caderno", 15.00, 1);
        
        carrinhoDeCompras.exibirItems();
        
        carrinhoDeCompras.removerItem("Caderno");

        carrinhoDeCompras.exibirItems();

        System.out.println("Valor total do carrinho: R$ " + carrinhoDeCompras.calcularValorTotal());
    }
}
