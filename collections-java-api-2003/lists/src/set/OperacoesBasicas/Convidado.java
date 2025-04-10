package set.OperacoesBasicas;

public class Convidado {

    private final String nome;
    private final int codigoConvite;
    
    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Convidado{");
        sb.append("nome = ").append(nome);
        sb.append(", codigoConvite = ").append(codigoConvite);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.codigoConvite;
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
        final Convidado other = (Convidado) obj;
        return this.codigoConvite == other.codigoConvite;
    }

    
    
}
