import java.util.ArrayList;
import java.util.List;

public class Banco {
    public String nomeBanco;
    public  int telefone;
    private final List<Cliente> clientes;
    public int agencia = 1;

    public Banco(String nomeBanco, int telefone) {
        this.nomeBanco = nomeBanco;
        this.telefone = telefone;
        this.clientes = new ArrayList<>();
        this.agencia = agencia++;
    }
    
    public String getNomeBanco() {
        return nomeBanco;
    }
    
    public int getTelefone() {
        return telefone;
    }
    public int getAgencia() {
        return agencia;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void adicionarCliente(Banco banco, Cliente cliente) {
        if (!clientes.contains(cliente)) {
            clientes.add(cliente);
        }
    }

    public void exibirClientes() {
        System.out.println("Lista de Clientes do Instituição " + nomeBanco + ":");
        for (Cliente cliente : clientes) {
            System.out.println(cliente.getNome() + " - CPF: " + cliente.getCpf() + " - Salário: R$ " + cliente.getSalario());
        }
    }

}
