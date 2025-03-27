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

    public double getSaldoConta() {
        return saldoConta;
    }
    
    public double getChequeEspecialInicial() {
        return chequeEspecialInicial;
    }
    
    public void setChequeEspecialInicial(double chequeEspecialInicial) {
        this.chequeEspecialInicial = chequeEspecialInicial;
    }
    
    public double getChequeEspecial() {
        return chequeEspecial;
    }
    
    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
    
    public void saldoInicial (double depositoInicial){
        saldoConta = depositoInicial;
    }

    public void depositar(double valorDeposito){
        double taxaChequeEspecial = 0.2*(chequeEspecialInicial - chequeEspecial);
        if (valorDeposito > 0 && chequeEspecial == chequeEspecialInicial){
            saldoConta += valorDeposito;
            System.out.println("Depósito de R$" + valorDeposito + " realizado com sucesso!");
        } else if (valorDeposito > 0 && chequeEspecial < chequeEspecialInicial){
            saldoConta += valorDeposito - taxaChequeEspecial - (chequeEspecialInicial - chequeEspecial);
            if (saldoConta < 0){
                System.out.println("Depósito de R$" + valorDeposito + " realizado com sucesso!\nForam descontados R$" + taxaChequeEspecial + " referente ao uso do limite prévio do seu cheque especial(R$" + (chequeEspecialInicial - chequeEspecial) + ").");
                chequeEspecial += Math.abs(saldoConta);
                saldoConta = 0;
            } else {
                System.out.println("Depósito de R$" + valorDeposito + " realizado com sucesso!\nForam descontados R$" + taxaChequeEspecial + " referente ao uso do limite prévio do seu cheque especial(R$" + (chequeEspecialInicial - chequeEspecial) + ").");
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
            chequeEspecial -= (valorSaque - saldoConta);
            saldoConta = 0;
            System.out.println("Saque de R$" + valorSaque + " realizado com sucesso!\nForam usados R$" + (chequeEspecialInicial - chequeEspecial) + " do seu cheque especial.");
        } else {
            System.out.println("Valor inválido para saque.");
        }
    }

    public void pagarBoleto(double valorBoleto){
        double saldoTotal = saldoConta + chequeEspecial;
        if (valorBoleto > 0 && valorBoleto <= saldoConta){
            saldoConta -= valorBoleto;
            System.out.println("Boleto de R$" + valorBoleto + " pago com sucesso!");
        } else if (valorBoleto > saldoConta && valorBoleto <= saldoTotal){
            chequeEspecial -= (valorBoleto - saldoConta);
            saldoConta = 0;
            System.out.println("Boleto de R$" + valorBoleto + " pago com sucesso!\nForam usados R$" + (chequeEspecialInicial - chequeEspecial) + " do seu cheque especial."); 
        } else {
            System.out.println("Valor inválido para pagamento de boleto.");
        }
    }



    
}
