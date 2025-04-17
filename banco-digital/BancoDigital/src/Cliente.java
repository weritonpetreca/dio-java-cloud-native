public class Cliente {
    private final String nome;
    private final String cpf;
    @SuppressWarnings("FieldMayBeFinal")
    private double salario;

    public Cliente(String cpf, String nome, double salario) {
        this.cpf = cpf;
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }

}
