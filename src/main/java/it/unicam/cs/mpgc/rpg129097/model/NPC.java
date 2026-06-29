package it.unicam.cs.mpgc.rpg129097.model;

import it.unicam.cs.mpgc.rpg129097.interfaces.Validabile;
import it.unicam.cs.mpgc.rpg129097.interfaces.Validatore;

public class NPC extends Personaggio  {
    private Validatore item;
    private Validabile informazione;
    private String professione;


    public NPC(String nome, String professione,Validatore item, Validabile informazione){
        super(nome);
        this.item = item;
        this.informazione = informazione;
        this.professione = professione;

    }
    public Validatore getItem(){return this.item;}
    public void setItem(Validatore item){this.item = item;}

    public Validabile getInformazione(){return this.informazione;}
    public void setInformazione(Validabile informazione){this.informazione = informazione;}


    //TODO implementare
    @Override
    public void presentati(){};


}
