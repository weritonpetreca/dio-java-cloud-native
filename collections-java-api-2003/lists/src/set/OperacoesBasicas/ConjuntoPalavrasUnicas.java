package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    Set<String> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasUnicasSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (!palavrasUnicasSet.isEmpty()) {
            if (palavrasUnicasSet.contains(palavra)) {
                palavrasUnicasSet.remove(palavra);
            } else {
                System.out.println("Palavra " + palavra + " não encontrada.");
            }
        } else {
            System.out.println("Conjunto de palavras vazio.");
        }
    }

    public boolean verificarPalavra(String palavra) {
        return palavrasUnicasSet.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        if (!palavrasUnicasSet.isEmpty()) {
            System.out.println("Palavras únicas: " + palavrasUnicasSet);
        } else {
            System.out.println("Conjunto de palavras vazio.");
        }
    }
    
    public void quantidadePalavrasUnicas() {
        System.out.println("Quantidade de palavras únicas: " + palavrasUnicasSet.size());
    }
}