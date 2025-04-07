package lists.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private final List<Livro> listaDeLivros;

    public CatalogoLivros() {this.listaDeLivros = new ArrayList<>();}

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        listaDeLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!listaDeLivros.isEmpty()){
            for (Livro l : listaDeLivros) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
            return livrosPorAutor;
        } else {throw new RuntimeException("Catalogo vazio!");}
    }
    
    public List<Livro> perquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAno = new ArrayList<>();
        if (!listaDeLivros.isEmpty()){
            for (Livro l : listaDeLivros) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {livrosPorIntervaloAno.add(l);}
            } 
            return livrosPorIntervaloAno;
        } else {throw new RuntimeException("Catalogo vazio!");}
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!listaDeLivros.isEmpty()){
            for (Livro l : listaDeLivros) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            } 
            return livroPorTitulo;
        } else {throw new RuntimeException("Catalogo vazio!");}
    }
}
