package map.Ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String atracao, String nome) {
        eventosMap.put(data, new Evento(atracao, nome));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosOrdenados = new TreeMap<>(eventosMap);
        for(Map.Entry<LocalDate, Evento> entry : eventosOrdenados.entrySet()) {
           LocalDate dataEvento = entry.getKey();
           Evento evento = entry.getValue();
           System.out.println("Data: " + dataEvento + ", Evento: " + evento.getNome() + ", Atração: " + evento.getAtracao());
        }
    }  

    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        LocalDate dataProximoEvento = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventosMap);
        for(Map.Entry<LocalDate, Evento> entry : eventoTreeMap.entrySet()) {
            LocalDate dataEvento = entry.getKey();
            if (dataEvento.isEqual(dataAtual) || dataEvento.isAfter(dataAtual)) {
                dataProximoEvento = dataEvento;
                proximoEvento = entry.getValue();
                break;
            }
        }
        if (proximoEvento != null) {
            System.out.println("Proximo evento: " + dataProximoEvento + ", Evento: " + proximoEvento.getNome() + ", Atração: " + proximoEvento.getAtracao());
        } else {
            System.out.println("Não há eventos futuros.");
        }
    }
}

