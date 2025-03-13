package edu.weriton.anatomia;
public class Nomes {
    public static void main (String [] args) {
        String primeiroNome = "Weriton";
        String segundoNome = "Petreca";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do Método " +primeiroNome.concat(" ").concat(segundoNome);
    }
}