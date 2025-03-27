public class Carro {
    
    private boolean ligado = false;
    private int velocidade = 0;
    private int marcha = 0;
    private String sentido = "Norte";
    
    public boolean isLigado() {
        return ligado;
    }
   
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
   
    public int getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    
    public int getMarcha() {
        return marcha;
    }
    
    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }
    
    public String getSentido() {
        return sentido;
    }
    
    public void setSentido(String sentido) {
        this.sentido = sentido;
    }
    


}
