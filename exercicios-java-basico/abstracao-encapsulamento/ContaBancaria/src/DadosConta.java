public class DadosConta {



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;





    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }



    public static double chequeEspecial(){
        if (depositoInicial <= 500){
            return 50;
        } else {
            return depositoInicial * 0.2;
        }
    };

    public double saldoConta;


}
