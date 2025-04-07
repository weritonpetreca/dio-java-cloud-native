package lists.Ordenacao;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private final List<Integer> numerosInteiros;

    public SomaNumeros() {
        this.numerosInteiros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numerosInteiros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for (int numero : numerosInteiros) {
            soma += numero;
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        if (!numerosInteiros.isEmpty()) {
            int maiorNumero = Integer.MIN_VALUE;
            for (int numero : numerosInteiros) {
                if (numero > maiorNumero) {
                    maiorNumero = numero;
                }
            }
            return maiorNumero;
        } else throw new RuntimeException("Lista vazia!");
    }

    public int encontrarMenorNumero() {
        if (!numerosInteiros.isEmpty()) {
            int menorNumero = Integer.MAX_VALUE;
            for (int numero : numerosInteiros) {
                if (numero < menorNumero) {
                    menorNumero = numero;
                }
            }
            return menorNumero;
        } else throw new RuntimeException("Lista vazia!");
    }

    public void exibirNumeros() {
        if (!numerosInteiros.isEmpty()) {
            System.out.println("Números Inteiros: " + this.numerosInteiros);
        } else throw new RuntimeException("Lista vazia!");
    }
}
