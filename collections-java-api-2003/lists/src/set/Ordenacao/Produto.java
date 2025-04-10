package set.Ordenacao;

import java.util.Comparator;

public class Produto implements Comparable<Produto> {
    
    private final String nome;
    private final double preco;
    private final long codigo;
    private final int quantidade;
    
    public Produto(long codigo, String nome, double preco, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }
    
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public long getCodigo() {
        return codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Produto{");
        sb.append("").append(nome);
        sb.append(", ").append(preco);
        sb.append(", ").append(codigo);
        sb.append(", ").append(quantidade);
        sb.append('}');
        return sb.toString();
    }

   
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (codigo ^ (codigo >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if (codigo != other.codigo)
            return false;
        return true;
    }    
}

class ComparatorPorPreco implements Comparator<Produto> {

    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }

}

