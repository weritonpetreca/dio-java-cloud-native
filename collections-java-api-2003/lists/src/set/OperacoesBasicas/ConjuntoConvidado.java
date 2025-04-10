package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {
    public Set<Convidado> convidadosSet;

    public ConjuntoConvidado() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadosSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }  
        }
        if (convidadoParaRemover != null) {
            convidadosSet.remove(convidadoParaRemover);
        } else {
            System.out.println("Convidado com código de convite " + codigoConvite + " não encontrado.");
        }
    }

    public int contarConvidados() {
        return convidadosSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadosSet);
    }

    
}
