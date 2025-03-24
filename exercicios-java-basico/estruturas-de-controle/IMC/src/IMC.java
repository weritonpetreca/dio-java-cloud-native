import java.text.DecimalFormat;

public class IMC {
    public IMC (double weight, double heigh){
        double IMC = weight / (heigh * heigh);
        DecimalFormat formato = new DecimalFormat("#,##");
        IMC = Double.valueOf(formato.format(IMC));
        if (IMC <= 18.5){
            System.out.println("Seu IMC é " + IMC+ ", você se enquadra na categoria de Abaixo do peso.");
        } else if (IMC <= 24.9){
            System.out.println("Seu IMC é " + IMC + ", você se enquadra na categoria de Peso ideal.");
        } else if (IMC <= 29.9){
            System.out.println("Seu IMC é " + IMC + ", você se enquadra na categoria de Levemente acima do peso.");
        } else if (IMC <= 34.9){
            System.out.println("Seu IMC é " + IMC + ", você se enquadra na categoria de Obesidade Grau I.");
        } else if (IMC <= 39.9){
            System.out.println("Seu IMC é " + IMC + ", você se enquadra na categoria de Obesidade Grau II (Severa).");
        } else {
            System.out.println("Seu IMC é " + IMC + ", você se enquadra na categoria de Obesidade Grau III (Mórbida).");
        }

    }
}
