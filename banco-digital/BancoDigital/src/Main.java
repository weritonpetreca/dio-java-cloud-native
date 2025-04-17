public class Main {
    public static void main(String[] args) throws Exception {
        
        Banco banco = new Banco("Banco do Brasil", 123456789);
        Cliente cliente1 = new Cliente("123.456.789-00", "João Silva", 5000.00);
        Cliente cliente2 = new Cliente("987.654.321-00", "Maria Oliveira", 7000.00);
        ContaCorrente conta1 = new ContaCorrente(banco, cliente1);
        ContaPoupanca conta2 = new ContaPoupanca(banco, cliente1);
        ContaPoupanca conta3 = new ContaPoupanca(banco, cliente2);
        ContaCorrente conta4 = new ContaCorrente(banco, cliente2);
        conta1.depositar(1000.00);
        conta1.sacar(200.00);
        conta2.depositar(500.00);
        conta2.sacar(100.00);
        conta1.transferir(300.00, conta2);
        conta2.transferir(200.00, conta1);
        conta1.extrato();
        conta2.extrato();
        
        conta3.depositar(2000.00);
        conta3.sacar(500.00);
        conta4.depositar(1000.00);
        conta4.sacar(200.00);
        conta3.extrato();
        conta4.extrato();
        
        conta1.transferir(100.00, conta3);
        
        conta1.extrato();
        conta3.extrato();

        banco.exibirClientes();
    }    
}
