    package it.unicam.cs.mpgc.rpg129097.interfaces;
    import it.unicam.cs.mpgc.rpg129097.model.Personaggio;

    public interface Validabile {
        void setEsito(boolean esito);
        void setAffidabile(boolean affidabile);
        boolean isAffidabile();
        boolean getEsito();
        Personaggio getFonte();
    }