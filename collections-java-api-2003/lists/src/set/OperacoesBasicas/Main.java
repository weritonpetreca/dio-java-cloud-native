package set.OperacoesBasicas;

public class Main {
    public static void main(String[] args) {
        
        ConjuntoConvidado conjuntoConvidado = new ConjuntoConvidado();
        
        System.out.println("Existem " + conjuntoConvidado.contarConvidados() + " convidado(s) dentro do Set de Convidados.");
        
        conjuntoConvidado.adicionarConvidado("João", 1234);
        conjuntoConvidado.adicionarConvidado("Maria", 5678);
        conjuntoConvidado.adicionarConvidado("Pedro", 9012);
        conjuntoConvidado.adicionarConvidado("Ana", 3456);
        conjuntoConvidado.adicionarConvidado("Carl", 7890);
        conjuntoConvidado.adicionarConvidado("Carl", 7890); // Adicionando um convidado duplicado
        
        
        System.out.println("Existem " + conjuntoConvidado.contarConvidados() + " convidado(s) dentro do Set de Convidados.");

        conjuntoConvidado.removerConvidadoPorCodigoConvite(1234);
        conjuntoConvidado.removerConvidadoPorCodigoConvite(9999); // Tentando remover um convidado que não existe
        conjuntoConvidado.removerConvidadoPorCodigoConvite(5678);

        System.out.println("Existem " + conjuntoConvidado.contarConvidados() + " convidado(s) dentro do Set de Convidados.");

        conjuntoConvidado.exibirConvidados();


        ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas();

        conjuntoLinguagens.adicionarPalavra("Java");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("JavaScript");
        conjuntoLinguagens.adicionarPalavra("C++");
        conjuntoLinguagens.adicionarPalavra("C++"); // Adicionando uma palavra duplicada
        conjuntoLinguagens.adicionarPalavra("C#");

        conjuntoLinguagens.exibirPalavrasUnicas();
        conjuntoLinguagens.quantidadePalavrasUnicas();
        
        conjuntoLinguagens.removerPalavra("Java");
        conjuntoLinguagens.removerPalavra("Ruby"); // Tentando remover uma palavra que não existe
        
        conjuntoLinguagens.exibirPalavrasUnicas();
        conjuntoLinguagens.quantidadePalavrasUnicas();

        System.out.println("A palavra 'Python' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Python"));
        System.out.println("A palavra 'Ruby' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Ruby"));

    }
}
