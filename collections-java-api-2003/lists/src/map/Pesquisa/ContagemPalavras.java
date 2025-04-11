package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> contarPalavrasMap;

    public ContagemPalavras() {
        this.contarPalavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        contarPalavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if (!contarPalavrasMap.isEmpty()) {
            if (contarPalavrasMap.containsKey(palavra)) {
                contarPalavrasMap.remove(palavra);
                System.out.println("Palavra removida: " + palavra);
            } else {
                System.out.println("Palavra não encontrada: " + palavra);
            }
        } else {
            System.out.println("Map vazio!");
        }
    }

    public void exibirContagemPalavras() {
        if (!contarPalavrasMap.isEmpty()) {
            for (Map.Entry<String, Integer> entry : contarPalavrasMap.entrySet()) {
                System.out.println("Palavra: " + entry.getKey() + ", Contagem: " + entry.getValue());
            }
        } else {
            System.out.println("Mapa vazio.");
        }
    }

    public void encontrarPalavraMaisFrequente() {
        if (!contarPalavrasMap.isEmpty()) {
            String palavraMaisFrequente = null;
            int maiorContagem = Integer.MIN_VALUE;
            for (Map.Entry<String, Integer> entry : contarPalavrasMap.entrySet()) {
                if (entry.getValue() > maiorContagem) {
                    maiorContagem = entry.getValue();
                    palavraMaisFrequente = entry.getKey();
                }
            }
            System.out.println("Palavra mais frequente: " + palavraMaisFrequente + ", Contagem: " + maiorContagem);
        } else {
            System.out.println("Mapa vazio.");
        }
    }
}
