public class DadosInicialConta {
    
    private double depositoInicial;

    private double chequeEspecial;
    
    private double chequeEspecialInicial;
    
    public DadosInicialConta(double depositoInicial) {
        this.depositoInicial = depositoInicial;
    }

    public double getchequeEspecialInicial() {
        return chequeEspecialInicial;
    }
    
    public void setchequeEspecialInicial(double chequeEspecialInicial) {
        this.chequeEspecialInicial = chequeEspecialInicial;
    }
    
    public void calculoChequeEspecialInicial(){
        if (depositoInicial <= 500){
            setchequeEspecialInicial(50);
            setChequeEspecial(50); 
        } else {
            setchequeEspecialInicial(depositoInicial * 0.2);
            setChequeEspecial(depositoInicial * 0.2);
        }
    }
    
    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public double getDepositoInicial() {
        return depositoInicial;
    }

    public void setDepositoInicial(double depositoInicial) {
        this.depositoInicial = depositoInicial;
    }

}
