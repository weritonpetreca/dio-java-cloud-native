package map.Pesquisa;

public class Main {
    public static void main(String[] args) {

        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(1L, "Produto A", 10.0, 5);
        estoqueProdutos.adicionarProduto(2L, "Produto B", 25.0, 3);
        estoqueProdutos.adicionarProduto(3L, "Produto C", 15.0, 2);
        estoqueProdutos.adicionarProduto(4L, "Produto D", 25.0, 1);
        estoqueProdutos.adicionarProduto(5L, "Produto E", 90.0, 4);
        estoqueProdutos.adicionarProduto(6L, "Produto F", 20.0, 6);
        estoqueProdutos.adicionarProduto(7L, "Produto G", 70.0, 8);
        estoqueProdutos.adicionarProduto(8L, "Produto H", 30.0, 9);        
        estoqueProdutos.adicionarProduto(9L, "Produto I", 70.0, 1);

        estoqueProdutos.exibirProdutos();
        System.out.println(estoqueProdutos.obterProdutoMaisCaro()); 
        System.out.println(estoqueProdutos.obterProdutoMaisBarato()); 
        System.out.println(estoqueProdutos.calcularValorTotalEstoque()); 
        System.out.println(estoqueProdutos.obterProdutoMaiorQuantidadeValorTotal()); 


        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.adicionarPalavra("banana", 5);
        contagemPalavras.adicionarPalavra("maçã", 3);
        contagemPalavras.adicionarPalavra("uva", 2);
        contagemPalavras.adicionarPalavra("abacaxi", 1);
        contagemPalavras.adicionarPalavra("laranja", 4);
        

        contagemPalavras.exibirContagemPalavras();
        contagemPalavras.encontrarPalavraMaisFrequente();
        contagemPalavras.removerPalavra("banana");
        contagemPalavras.exibirContagemPalavras();
        contagemPalavras.encontrarPalavraMaisFrequente();
    }
}
