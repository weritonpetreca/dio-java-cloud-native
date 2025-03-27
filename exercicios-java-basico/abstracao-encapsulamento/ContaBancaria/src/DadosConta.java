public class DadosConta {
    
    private String name;
    private double saldoConta;
    private double chequeEspecialInicial;
    private double chequeEspecial;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public double getChequeEspecialInicial() {
        return chequeEspecialInicial;
    }
    
    public void setChequeEspecialInicial(double chequeEspecialInicial) {
        this.chequeEspecialInicial = chequeEspecialInicial;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }


    public void setChequeEspecial(double chequeEspecial) {
            this.chequeEspecial = chequeEspecial;
    }

    public void depositar(double valorDeposito){
        double saldoTotal = saldoConta + chequeEspecial;
        if (valorDeposito > 0 && chequeEspecial == chequeEspecialInicial){
            saldoConta += valorDeposito;
            System.out.println("Depósito de R$" + valorDeposito + " realizado com sucesso!");
        } else if (valorDeposito > 0 && chequeEspecial < chequeEspecialInicial){
            saldoConta += valorDeposito - 1.2*(chequeEspecialInicial - chequeEspecial);
            if (saldoTotal >= chequeEspecialInicial){
                chequeEspecial = chequeEspecialInicial;
                
            }
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valorSaque){
        double saldoTotal = saldoConta + chequeEspecial;
        if (valorSaque > 0 && valorSaque <= saldoConta){
            saldoConta -= valorSaque;
            System.out.println("Saque de R$" + valorSaque + " realizado com sucesso!");
        } else if (valorSaque > saldoConta && valorSaque <= saldoTotal){
            saldoConta = 0;
            chequeEspecial -= (valorSaque - saldoConta);
            System.out.println("Saque de R$" + valorSaque + " realizado com sucesso!\nForam usados R$" + (valorSaque - saldoConta) + " do seu cheque especial.");
        } else {
            System.out.println("Valor inválido para saque.");
        }
    }

    public void saldoInicial (double depositoInicial){
        saldoConta = depositoInicial;
    }


    
}
