package escola;

public class Escola {
    public static void main(String[] args) {
        Aluno Weriton = new Aluno();
        //Aluno Weriton = new Aluno(35, "Weriton Petreca");
        Weriton.setNome("Weriton Petreca");
        Weriton.setIdade(35);
        Weriton.setSexo("Masculino");

        System.out.println("O aluno " + Weriton.getNome() + " tem " + Weriton.getIdade() + " anos e é do sexo " + Weriton.getSexo());
    }
}
