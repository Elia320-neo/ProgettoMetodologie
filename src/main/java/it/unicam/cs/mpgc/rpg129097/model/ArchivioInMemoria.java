package it.unicam.cs.mpgc.rpg129097.model;

import it.unicam.cs.mpgc.rpg129097.interfaces.ArchivioInformazioni;

import java.util.Map;

public class ArchivioInMemoria implements ArchivioInformazioni {
    private final Map<String, Boolean> esiti;

    public ArchivioInMemoria(Map<String, Boolean> esiti){
        this.esiti = esiti;
    }

    @Override
    public boolean getEsito(String descrizione){
        return esiti.getOrDefault(descrizione, false);
    }


}
