package it.unicam.cs.mpgc.rpg129097.model;

import it.unicam.cs.mpgc.rpg129097.interfaces.Proposizione;

public class Fatto implements Proposizione {
    private final String descrizione;
    private final boolean esito;

    public Fatto(String descrizione, boolean esito) {
        if(descrizione == null) throw new NullPointerException("descrizione non può essere null");
        this.descrizione = descrizione;
        this.esito = esito;
    }

    @Override
    public String getDescrizione() { return descrizione; }

    @Override
    public boolean getEsito() { return esito; }
}

