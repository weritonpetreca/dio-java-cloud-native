package lists.Ordenacao;

public class Main {
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2000);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2001);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2001);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2002);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 2003);
        catalogoLivros.adicionarLivro("Livro 5", "Autor 5", 2004);
        catalogoLivros.adicionarLivro("Livro 6", "Autor 6", 2005);
        catalogoLivros.adicionarLivro("Livro 7", "Autor 7", 2006);
        catalogoLivros.adicionarLivro("Livro 8", "Autor 8", 2007);
        catalogoLivros.adicionarLivro("Livro 9", "Autor 9", 2008);
        catalogoLivros.adicionarLivro("Livro 10", "Autor 10", 2009);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 1"));

        System.out.println(catalogoLivros.perquisarPorIntervaloAnos(2000, 2005));

        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));

        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(15);
        somaNumeros.adicionarNumero(-24);
        somaNumeros.adicionarNumero(70);
        somaNumeros.adicionarNumero(3);

        System.out.println("Números Adicionados: ");

        somaNumeros.exibirNumeros();

        System.out.println("Soma: " + somaNumeros.calcularSoma());
        
        System.out.println("Maior Número: " + somaNumeros.encontrarMaiorNumero());
        
        System.out.println("Menor Número: " + somaNumeros.encontrarMenorNumero());
        
    }
}
