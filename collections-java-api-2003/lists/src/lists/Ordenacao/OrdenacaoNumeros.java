package lists.Ordenacao;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    List<Integer> listaDeNumeros;

    public OrdenacaoNumeros() {
        this.listaDeNumeros = new ArrayList<>();
    }
    

    public void adicionarNumero(int numero) {
        this.listaDeNumeros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numerosAscendentes = new ArrayList<>(listaDeNumeros);
        if (!listaDeNumeros.isEmpty()) {
            Collections.sort(numerosAscendentes);
            return numerosAscendentes;
        } else throw new RuntimeException("Lista vazia!");
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numerosDescendentes = new ArrayList<>(listaDeNumeros);
        if (!listaDeNumeros.isEmpty()) {
            Collections.sort(numerosDescendentes, Collections.reverseOrder());
            return numerosDescendentes;
        } else throw new RuntimeException("Lista vazia!");
    }

    public void exibirNumeros() {
        if (!listaDeNumeros.isEmpty()) {
            System.out.println("Números Inteiros: " + this.listaDeNumeros);
        } else throw new RuntimeException("Lista vazia!");
    }
}
