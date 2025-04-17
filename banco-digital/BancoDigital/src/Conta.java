public abstract class Conta implements IConta {
    private static int SEQUENCIAL = 1;

    private final String nomeBanco;
    private final int telefoneBanco;
    private final int agencia;
    private final int numeroConta;
    protected double saldo;
    private final Cliente cliente;

    public Conta(Banco banco, Cliente cliente) {
        this.nomeBanco = banco.getNomeBanco();
        this.telefoneBanco = banco.getTelefone();
        this.agencia = banco.getAgencia();
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;
        banco.adicionarCliente(banco, cliente);
    }

    @Override
    public void sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso na conta de " + this.cliente.getNome() + "!\n");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("Valor inválido para depósito!");
        }
        System.out.println("Depósito de R$ " + valor + " realizado com sucesso na conta de " + this.cliente.getNome() + "!\n");
    }

    @Override
    public void transferir(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.depositar(valor);
            System.out.println("Transferência de R$ " + valor + " realizada com sucesso para " + destino.cliente.getNome() + "!\n");
        } else {
            System.out.println("Saldo insuficiente para transferência!");
        }
    }

    @Override
    public void imprimirExtrato() {
        System.out.printf("Titular: %s\n", this.cliente.getNome());
        System.out.printf("Agência: %d\n", this.agencia);
        System.out.printf("Conta: %d\n", this.numeroConta);
        System.out.printf("Saldo: %.2f\n", this.saldo);
        System.out.printf("Instituição: %s\n", this.nomeBanco);
        System.out.printf("Telefone: %d\n\n", this.telefoneBanco);
    }
}
