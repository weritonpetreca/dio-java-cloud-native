package map.Ordenacao;

public class Evento {

    String nome;
    String atracao;

    public Evento(String atracao, String nome) {
        this.atracao = atracao;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getAtracao() {
        return atracao;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Evento{");
        sb.append("nome=").append(nome);
        sb.append(", atracao=").append(atracao);
        sb.append('}');
        return sb.toString();
    }

    
}
