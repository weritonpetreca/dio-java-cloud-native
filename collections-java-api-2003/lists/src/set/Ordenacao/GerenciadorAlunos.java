package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private final Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(int matricula, String nome, double nota) {
        alunoSet.add(new Aluno(matricula, nome, nota));
    }

    public void removerAluno(int matricula) {
        Aluno alunoARemover = null;
        for (Aluno aluno : alunoSet) {
            if (aluno.getMatricula() == matricula) {
                alunoARemover = aluno;
                break;
            }
        }
        if (alunoARemover != null) {
            alunoSet.remove(alunoARemover);
            System.out.println("Aluno removido com sucesso.");
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet); // Ordena por nome
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(alunoSet);
        return alunosPorNota;
    }

    public void exibirAlunos() {
        System.out.println(alunoSet);
    }
}
