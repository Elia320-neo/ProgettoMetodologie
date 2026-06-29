package it.unicam.cs.mpgc.rpg129097.model;

import it.unicam.cs.mpgc.rpg129097.interfaces.ArchivioEsiti;
import it.unicam.cs.mpgc.rpg129097.interfaces.Validabile;
import it.unicam.cs.mpgc.rpg129097.interfaces.Validatore;

public class Item implements Validatore {
    private String nome;
    private String descrizione;
    private boolean utilizzato;
    private final ArchivioEsiti archivio; //dipendenza di utilizzo

    public Item(String nome, String descrizione, ArchivioEsiti archivio){
        if(nome == null) throw new NullPointerException("nome non può essere null");
        if(descrizione == null) throw new NullPointerException("descrizione non può essere nulll");
        this.nome = nome;
        this.descrizione = descrizione;
        this.archivio = archivio;

    }

   //TODO fare refactor: code as prose
    @Override
    public boolean valida(Validabile informazione){
        this.utilizzato = true;
        informazione.setAffidabile(true);
        boolean esito = archivio.getEsito(informazione.getDescrizione());
       return esito;
    }

    public String getDescrizione(){return this.descrizione;}

    public String getNome(){return this.nome;}

    public boolean isUtilizzato(){return this.utilizzato;}

    public void setUtilizzato(boolean utilizzato){this.utilizzato = utilizzato;}
}
