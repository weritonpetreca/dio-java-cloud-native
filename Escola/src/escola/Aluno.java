package escola;

public class Aluno {
    private String nome;
    private int idade;
    private String sexo;

    /*public Aluno(int idade, String nome) {
    this.idade = idade;
    this.nome = nome;
    }*/
   
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
   
    public String getSexo() {
        return sexo;
    }
   
    public String getNome() {
        return nome;
    }
   
    public int getIdade() {
        return idade;
    }
     public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

}
