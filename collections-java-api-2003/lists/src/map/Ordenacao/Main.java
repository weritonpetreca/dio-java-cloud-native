package map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();
        agenda.adicionarEvento(LocalDate.of(2023, 5, 15), "Atracao 1", "Evento 1");
        agenda.adicionarEvento(LocalDate.of(2024, 5, 20), "Atracao 2", "Evento 2");
        agenda.adicionarEvento(LocalDate.of(2025, Month.APRIL, 25), "Atracao 3", "Evento 3");
        agenda.adicionarEvento(LocalDate.of(2025, 12, 10), "Atracao 4", "Evento 4");
        agenda.adicionarEvento(LocalDate.of(2025, Month.AUGUST, 30), "Atracao 5", "Evento 5");
        
        agenda.exibirAgenda();

        agenda.obterProximoEvento();


        LivrariaOnline livrariaOnline = new LivrariaOnline();

        livrariaOnline.adicionarLivro("link1", "autor1", 10, "livro1");
        livrariaOnline.adicionarLivro("link2", "autor2", 20, "livro2");
        livrariaOnline.adicionarLivro("link3", "autor2", 52, "livro3");
        livrariaOnline.adicionarLivro("link4", "autor4", 50, "livro4");
        livrariaOnline.adicionarLivro("link5", "autor5", 52, "livro5");
        livrariaOnline.adicionarLivro("link6", "autor6", 15, "livro6");
        livrariaOnline.adicionarLivro("link7", "autor7", 20, "livro7");
        livrariaOnline.adicionarLivro("link8", "autor2", 8, "livro8");
        livrariaOnline.adicionarLivro("link9", "autor9", 7, "livro9");
        livrariaOnline.adicionarLivro("link10", "autor2", 52, "livro10");

        System.out.println(livrariaOnline.exibirLivrosOrdenadosPorPreco());
        System.out.println(livrariaOnline.exibirLivrosOrdenadosPorAutor());
        livrariaOnline.removerLivro("livro1");
        
        System.out.println(livrariaOnline.exibirLivrosOrdenadosPorPreco());
        System.out.println(livrariaOnline.exibirLivrosOrdenadosPorAutor());

        System.out.println(livrariaOnline.pesquisarLivrosPorAutor("autor2"));

        System.out.println(livrariaOnline.obterLivroMaisCaro());
        System.out.println(livrariaOnline.obterLivroMaisBarato());

    }
}
