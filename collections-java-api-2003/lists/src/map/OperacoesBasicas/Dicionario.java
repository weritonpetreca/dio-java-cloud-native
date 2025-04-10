package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (!dicionarioMap.isEmpty()) {
            if (!dicionarioMap.containsKey(palavra)) {
                System.out.println("Palavra não encontrada.");
                return;
            }
            dicionarioMap.remove(palavra);
            System.out.println(palavra + " removida com sucesso.");
        } else {
            System.out.println("Dicionário vazio.");
        }
    }

    public void exibirPalavras() {
        if (!dicionarioMap.isEmpty()) {
            System.out.println(dicionarioMap);
        } else {
            System.out.println("Dicionário vazio.");
        }
    }

    public String pesquisarPorPalavra(String palavra) {
        String definicao;
        if (!dicionarioMap.isEmpty()) {
            definicao = dicionarioMap.get(palavra);
            return definicao;
        } else {
            System.out.println("Dicionário vazio.");
            return null;
        }
    }
}
