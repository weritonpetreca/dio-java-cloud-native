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
    }
}
