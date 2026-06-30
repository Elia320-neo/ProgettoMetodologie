    package it.unicam.cs.mpgc.rpg129097.model;


import java.util.List;
import java.util.ArrayList;

public class ArchivioFatti {

    private final List<Fatto> fatti;

    public ArchivioFatti(List<Fatto> fatti) {
        this.fatti = new ArrayList<>(fatti);
    }

    public Optional<Fatto> cerca(String descrizione) {
        return fatti.stream()
                .filter(f -> f.getDescrizione().equals(descrizione))
                .findFirst();
    }

    public boolean verifica(String descrizione) {
        return cerca(descrizione)
                .map(Fatto::isVero)
                .orElse(false);
    }
}
