import java.util.Scanner;

public class Carro {
    
    private boolean ligado = false;
    private int velocidade = 0;
    private int marcha = 0;
    private String sentido = "Norte";
    private final Scanner scanner = new Scanner(System.in);
    
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
    
    public void ligar() {
        if (!ligado) {
            setLigado(true);
            System.out.println("Carro ligado.");
        } else {
            System.out.println("Carro já está ligado.");
        }
    }

    
    public void desligar() {
        if (ligado && velocidade == 0 && marcha == 0) {
            setLigado(false);
            System.out.println("Carro desligado.");
        } else if (ligado && velocidade > 0 || marcha > 0) {
            System.out.println("Nao é possível desligar o carro.");
        }
        System.out.println("Carro já está desligado.");
    }
    
    public void acelerar() {
        if (ligado && velocidade < 120 && marcha > 0) {
            switch (velocidade) {
                case 20, 40, 60, 80, 100 -> {
                    System.out.println("Limite de marcha atingido. Troque de marcha.");
                }
                case 120 -> {
                    System.out.println("Limite de marcha atingido. Desacelere.");
                }
                default -> {
                    setVelocidade(getVelocidade() + 1);
                    System.out.println("Carro acelerado em 1 km/h.\n Velocidade atual: " + getVelocidade() + " km/h.");
                }
            }
        } else {
            System.out.println("Nao é possível acelerar.");
        }
    }

    public void desacelerar() {
        if (ligado && velocidade > 0) {
            switch (velocidade) {
                case 21, 41, 61, 81, 101 -> {
                    System.out.println("Limite de marcha atingido. Troque de marcha.");
                }
                case 0 -> {
                    System.out.println("Limite de marcha atingido. Ponha no ponto morto e desligue o carro.");
                }
                default -> {
                    setVelocidade(getVelocidade() - 1);
                    System.out.println("Carro desacelerado em 1 km/h.\n Velocidade atual: " + getVelocidade() + " km/h.");
                }
            }
        } else {
            System.out.println("Nao é possível desacelerar.");
        }
    }
        
    public void trocarMarcha() {
        System.out.println("Para qual marcha deseja trocar? (0-6)");
        int novaMarcha = scanner.nextInt();
        switch (novaMarcha) {
            case 0 -> {
                if (ligado && getVelocidade() == 0 && getMarcha() == 1) {
                    setMarcha(getMarcha() - 1);
                    System.out.println("Carro trocado de marcha. Agora está na marcha " + getMarcha() + ".");
                } else {
                    System.out.println("Nao é possível trocar de marcha.");
                }
            }
            case 1 -> {
                if (ligado && getVelocidade() == 21 && getMarcha() == 2) {
                    setMarcha(getMarcha() - 1);
                    setVelocidade(velocidade - 1);
                    System.out.println("Carro trocado de marcha. Agora está na marcha " + getMarcha() + ".");
                } else if (ligado && getVelocidade() == 0 && getMarcha() == 0) {
                    setMarcha(getMarcha() + 1);
                    setVelocidade(velocidade + 1);
                    System.out.println("Carro trocado de marcha. Agora está na marcha " + getMarcha() + ".");
                } else {
                    System.out.println("Nao é possível trocar de marcha.");
                }

            }
            case 2 -> {
                if (ligado && getVelocidade() == 41 && getMarcha() == 3) {
                    setMarcha(getMarcha() - 1);
                    setVelocidade(velocidade - 1);
                    System.out.println("Carro trocado de marcha. Agora está na marcha " + getMarcha() + ".");
                } else if (ligado && getVelocidade() == 20 && getMarcha() == 1) {
                    setMarcha(getMarcha() + 1);
                    setVelocidade(velocidade + 1);
                    System.out.println("Carro trocado de marcha. Agora está na marcha " + getMarcha() + ".");
                } else {
                    System.out.println("Nao é possível trocar de marcha.");
                }
            }
            case 3 -> {
                if (ligado && getVelocidade() == 61 && getMarcha() == 4) {
                    setMarcha(getMarcha() - 1);
                    setVelocidade(velocidade - 1);
                    System.out.println("Carro trocado de marcha. Agora está na marcha " + getMarcha() + ".");
                } else if (ligado && getVelocidade() == 40 && getMarcha() == 2) {
                    setMarcha(getMarcha() + 1);
                    setVelocidade(velocidade + 1);
                    System.out.println("Carro trocado de marcha. Agora está na marcha " + getMarcha() + ".");
                } else {
                    System.out.println("Nao é possível trocar de marcha.");
                }
            }
            case 4 -> {
                if (ligado && getVelocidade() == 81 && getMarcha() == 5) {
                    setMarcha(getMarcha() - 1);
                    setVelocidade(velocidade - 1);
                    System.out.println("Carro trocado de marcha. Agora está na marcha " + getMarcha() + ".");
                } else if (ligado && getVelocidade() == 60 && getMarcha() == 3) {
                    setMarcha(getMarcha() + 1);
                    setVelocidade(velocidade + 1);
                    System.out.println("Carro trocado de marcha. Agora está na marcha " + getMarcha() + ".");
                } else {
                    System.out.println("Nao é possível trocar de marcha.");
                }
            }
            case 5 -> {
                if (ligado && getVelocidade() == 101 && getMarcha() == 6) {
                    setMarcha(getMarcha() - 1);
                    setVelocidade(velocidade - 1);
                    System.out.println("Carro trocado de marcha. Agora está na marcha " + getMarcha() + ".");
                } else if (ligado && getVelocidade() == 80 && getMarcha() == 4) {
                    setMarcha(getMarcha() + 1);
                    setVelocidade(velocidade + 1);
                    System.out.println("Carro trocado de marcha. Agora está na marcha " + getMarcha() + ".");
                } else {
                    System.out.println("Nao é possível trocar de marcha.");
                }
            }
            case 6 -> {
                if (ligado && getVelocidade() == 100 && getMarcha() == 5) {
                    setMarcha(getMarcha() + 1);
                    setVelocidade(velocidade + 1);
                    System.out.println("Carro trocado de marcha. Agora está na marcha " + getMarcha() + ".");
                } else {
                    System.out.println("Nao é possível trocar de marcha.");
                }
            }            
            default -> System.out.println("Opção inválida.");      
        }
    }

    public void verificarStatus() {
        System.out.println("Velocidade atual: " + getVelocidade() + " km/h");
        System.out.println("Marcha atual: " + getMarcha() + ".");
        System.out.println("Sentido atual: " + getSentido() + ".");
    }

    public void virar() {
        System.out.println("Para qual lado deseja virar? (direita (D)/esquerda (E))");
        String direcao = scanner.next();
        String lado = "";
        if (direcao .equalsIgnoreCase("d")) {
            lado = "direita";
        } else if (direcao .equalsIgnoreCase("e")) {
            lado = "esquerda";
        }
        if (ligado && getVelocidade() > 0 && getVelocidade() <= 40) {
            System.out.println("Carro virado para " + lado + ".");
            if (lado.equalsIgnoreCase("d")) {
                switch (sentido) {
                    case "Norte" -> setSentido("Leste");
                    case "Leste" -> setSentido("Sul");
                    case "Sul" -> setSentido("Oeste");
                    case "Oeste" -> setSentido("Norte");
                }
            } else if (lado.equalsIgnoreCase("e")) {
                switch (sentido) {
                    case "Norte" -> setSentido("Oeste");
                    case "Leste" -> setSentido("Norte");
                    case "Sul" -> setSentido("Leste");
                    case "Oeste" -> setSentido("Sul");
                }
            }
            System.out.println("Sentido atual: " + getSentido() + ".");
        } else {
            System.out.println("Nao é possível virar o carro.");
        }
    }
    

}
