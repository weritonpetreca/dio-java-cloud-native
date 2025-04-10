package set.Ordenacao;

import java.util.Comparator;

public class Aluno implements Comparable<Aluno> {
    private final String nome;
    private final int matricula;
    private final double nota;
    
    public Aluno(int matricula, String nome, double nota) {
        this.matricula = matricula;
        this.nome = nome;
        this.nota = nota;
    }
    @Override
    public int compareTo(Aluno a) {
        return nome.compareToIgnoreCase(a.getNome());
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }
    
    public double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append(nome);
        sb.append(", ").append(matricula);
        sb.append(", ").append(nota);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.matricula;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        return this.matricula == other.matricula;
    } 
}

class ComparatorPorNota implements Comparator<Aluno> {

    @Override
    public int compare(Aluno a1, Aluno a2) {
        return Double.compare(a1.getNota(), a2.getNota());
    }
    
}