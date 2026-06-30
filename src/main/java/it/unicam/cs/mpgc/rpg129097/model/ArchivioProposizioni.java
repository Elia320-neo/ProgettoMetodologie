package it.unicam.cs.mpgc.rpg129097.model;

import it.unicam.cs.mpgc.rpg129097.interfaces.Proposizione;

import java.util.*;

public class ArchivioProposizioni {

    private final Map<String, Proposizione> proposizioni;

    public ArchivioProposizioni(Collection<Proposizione> props) {
        this.proposizioni = new HashMap<>();
        for (Proposizione p : props) {
            proposizioni.put(p.getDescrizione(), p);
        }
    }

    public Proposizione cerca(String descrizione) {
        return proposizioni.get(descrizione);
    }

}
