package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefasSet;

    public ListaTarefas() {
        this.tarefasSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefasSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;
        if (!tarefasSet.isEmpty()){
            for (Tarefa t : tarefasSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaParaRemover = t;
                    break;
                }
            }
            tarefasSet.remove(tarefaParaRemover);
        } else {
            System.out.println("Lista de tarefas vazia.");
        }

        if (tarefaParaRemover == null) {
            System.out.println("Tarefa " + descricao + " não encontrada.");
        } else {
            System.out.println("Tarefa " + descricao + " removida com sucesso.");
        }
    }

    public void exibirTarefas() {
        if (!tarefasSet.isEmpty()) {
            System.out.println(tarefasSet);
        } else {
            System.out.println("Lista de tarefas vazia.");
        }
    }

    public int contarTarefas() {
        return tarefasSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefasSet) {
            if (t.isConcluida()) {
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : tarefasSet) {
            if (!t.isConcluida()) {
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        Tarefa tarefaParaMarcar = null;
        for (Tarefa t : tarefasSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaMarcar = t;
                break;
            }
        }
        if (tarefaParaMarcar != null) {
            tarefaParaMarcar.setConcluida(true);
        }
    }

    public void marcarTarefaPendente(String descricao) {
        Tarefa tarefaParaDesmarcar = null;
        for (Tarefa t : tarefasSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaDesmarcar = t;
                break;
            }
        }
        if (tarefaParaDesmarcar != null){
            if (tarefaParaDesmarcar.isConcluida()){
                tarefaParaDesmarcar.setConcluida(false);
            } else {
                System.out.println("Tarefa " + descricao + " já está pendente.");
            }
        }
        else {
            System.out.println("Tarefa " + descricao + " não encontrada.");
        }
    }

    public void limparListaTarefas() {
        if (!tarefasSet.isEmpty()) {
            tarefasSet.clear();
            System.out.println("Lista de tarefas limpa.");
        } else {
            System.out.println("Lista de tarefas já está vazia.");
        }
    }
}
