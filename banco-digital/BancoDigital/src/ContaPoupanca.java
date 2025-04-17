public class ContaPoupanca extends Conta {

    public ContaPoupanca(Banco banco, Cliente cliente) {
        super(banco, cliente);
    }

    public void rendimento() {
        this.saldo *= 1.01;
    }

    public void extrato() {
        System.out.println("======= Extrato Conta Poupança =======");
        rendimento();
        super.imprimirExtrato();
    }


}
