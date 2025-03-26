public class DadosInicialConta {

    public DadosInicialConta(double depositoInicial) {
        this.depositoInicial = depositoInicial;
    }
    public static double getDepositoInicial() {
        return depositoInicial;
    }
    public  void setDepositoInicial(double depositoInicial) {
        this.depositoInicial = depositoInicial;
    }
    public static double depositoInicial;
}
