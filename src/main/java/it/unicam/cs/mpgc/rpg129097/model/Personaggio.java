package it.unicam.cs.mpgc.rpg129097.model;


public abstract class Personaggio {
    protected String nome;
    protected boolean vivo;


    protected Personaggio(String nome){
        if(nome == null) throw new NullPointerException("nome non può essere null");
        this.nome = nome;
        this.vivo = true;
    }

    public String getNome() {return this.nome;}

    public boolean isVivo() {return this.vivo;}

    public void uccidi() {this.vivo=false;}


    public abstract void presentati();

}
