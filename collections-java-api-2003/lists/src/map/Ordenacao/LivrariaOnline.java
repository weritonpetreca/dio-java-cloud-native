package map.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LivrariaOnline {
    private Map<String, Livro> livrosMap;

    public LivrariaOnline() {
        this.livrosMap = new HashMap<>();
    }


    public void adicionarLivro(String link, String autor, int preco, String titulo) {
        livrosMap.put(link, new Livro(autor, preco, titulo));
    }

    public void removerLivro(String titulo) {
        List<String> chavesParaRemover = new ArrayList<>();
        for (Map.Entry<String, Livro> entry : livrosMap.entrySet()) {
            if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
                chavesParaRemover.add(entry.getKey());
            }
        }
        for (String chave : chavesParaRemover) {
            livrosMap.remove(chave);
        }
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(livrosMap.entrySet());
        Collections.sort(livrosParaOrdenarPorPreco, new ComparatorPorPreco());
        Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();
        for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorPreco) {
            livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
        }        
        return livrosOrdenadosPorPreco;
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorAutor() {
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorAutor = new ArrayList<>(livrosMap.entrySet());
        Collections.sort(livrosParaOrdenarPorAutor, new ComparatorPorAutor());
        Map<String, Livro> livrosOrdenadosPorAutor = new LinkedHashMap<>();
        for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorAutor) {
            livrosOrdenadosPorAutor.put(entry.getKey(), entry.getValue());
        }        
        return livrosOrdenadosPorAutor;
    }

    public Map<String, Livro> pesquisarLivrosPorAutor(String autor) {
        Map<String, Livro> livrosPorAutor = new LinkedHashMap<>();
        for (Map.Entry<String, Livro> entry : livrosMap.entrySet()) {
        Livro livro = entry.getValue();
            if (livro.getAutor().equalsIgnoreCase(autor)) {
            livrosPorAutor.put(entry.getKey(), livro);
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> obterLivroMaisCaro() {
        List<Livro> livrosMaisCaros = new ArrayList<>();
        double precoMaisAlto = Double.MIN_VALUE;
        
        if (!livrosMap.isEmpty()) {
            for (Livro livro : livrosMap.values()) {
                if (livro.getPreco() > precoMaisAlto) {
                    precoMaisAlto = livro.getPreco();
                }
            }
        } else {
            throw new RuntimeException("Catalogo vazio!");
        }
        
        for (Livro livro : livrosMap.values()) {
            if (livro.getPreco() == precoMaisAlto) {
                livrosMaisCaros.add(livro);
            }
        }
        
        return livrosMaisCaros;
    }

    public List<Livro> obterLivroMaisBarato() {
        List<Livro> livrosMaisBaratos = new ArrayList<>();
        double precoMaisBaixo = Double.MAX_VALUE;
        
        if (!livrosMap.isEmpty()) {
            for (Livro livro : livrosMap.values()) {
                if (livro.getPreco() < precoMaisBaixo) {
                    precoMaisBaixo = livro.getPreco();
                }
            }
        } else {
            throw new RuntimeException("Catalogo vazio!");
        }
        
        for (Livro livro : livrosMap.values()) {
            if (livro.getPreco() == precoMaisBaixo) {
                livrosMaisBaratos.add(livro);
            }
        }
        
        return livrosMaisBaratos;
    }
}
