package GoF.subsistema2.cep;

public class CepApi {

    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia() {
        return instancia;
    }

    public String recuperarCidade (String cep) {
        return "Borda da Mata";
    }

    public String recuperarEstado (String cep) {
        return "MG";
    }
}
