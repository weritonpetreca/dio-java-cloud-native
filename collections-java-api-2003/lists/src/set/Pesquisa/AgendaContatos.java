package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    public Set<Contato> contatosSet;

    public AgendaContatos() {
        this.contatosSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int telefone) {
        contatosSet.add(new Contato(nome, telefone));
    }

    public void exibirContatos() {
        System.out.println(contatosSet);
    }

    public Set<Contato> pesquisarPorNome (String nome) {
        Set<Contato> contatosEncontrados = new HashSet<>();
        for (Contato c : contatosSet) {
            if (c.getNome().startsWith(nome)) {
                contatosEncontrados.add(c);
            }
        }
        return contatosEncontrados;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatosSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setTelefone(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }
}
