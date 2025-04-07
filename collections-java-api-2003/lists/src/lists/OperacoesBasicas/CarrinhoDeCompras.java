package lists.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    protected final List <Item> listaDeItems;

    public CarrinhoDeCompras(){
        this.listaDeItems = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        listaDeItems.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itemsParaRemover = new ArrayList<>();
        for (Item i : listaDeItems) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                itemsParaRemover.add(i);
            }
        }
        listaDeItems.removeAll(itemsParaRemover);
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        if (!listaDeItems.isEmpty()){
            for (Item i : listaDeItems) {
                valorTotal += i.getPreco() * i.getQuantidade();
            }
            return valorTotal;
        } else {
            throw new RuntimeException("Carrinho vazio!");
        }
    }

    public void exibirItems() {
        if (!listaDeItems.isEmpty()){
            System.out.println(this.listaDeItems);
        } else {
            System.out.println("Carrinho vazio!");
        }
    }
}
