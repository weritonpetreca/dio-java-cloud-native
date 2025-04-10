package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private final Map<Long, Produto> estoqueMap;
    
    public EstoqueProdutos() {
        this.estoqueMap = new HashMap<>();
    }

    public void adicionarProduto(Long cod, String nome, Double preco, Integer quantidade) {
        estoqueMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(estoqueMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotal = 0d;
        if (!estoqueMap.isEmpty()) {
            for (Produto p : estoqueMap.values()) {
                valorTotal += p.getPreco() * p.getQuantidade();
            }
            return valorTotal;
        } else {
            throw new RuntimeException("Estoque vazio!");
        }
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueMap.isEmpty()) {
            for (Produto p : estoqueMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    maiorPreco = p.getPreco();
                    produtoMaisCaro = p;
                }
            }
            return produtoMaisCaro;
        } else {
            throw new RuntimeException("Estoque vazio!");
        }
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if (!estoqueMap.isEmpty()) {
            for (Produto p : estoqueMap.values()) {
                if (p.getPreco() < menorPreco) {
                    menorPreco = p.getPreco();
                    produtoMaisBarato = p;
                }
            }
            return produtoMaisBarato;
        } else {
            throw new RuntimeException("Estoque vazio!");
        }
    }

    public Produto obterProdutoMaiorQuantidadeValorTotal() {
        Produto produtoMaiorValorTotal = null;
        double maiorValorTotal = Double.MIN_VALUE;
        if (!estoqueMap.isEmpty()) {
            for (Produto p : estoqueMap.values()) {
                double valorTotal = p.getPreco() * p.getQuantidade();
                if (valorTotal > maiorValorTotal) {
                    maiorValorTotal = valorTotal;
                    produtoMaiorValorTotal = p;
                }
            }
            return produtoMaiorValorTotal;
        } else {
            throw new RuntimeException("Estoque vazio!");
        }
    }
}
