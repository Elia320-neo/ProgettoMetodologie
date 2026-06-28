    package it.unicam.cs.mpgc.rpg129097.interfaces;
    import it.unicam.cs.mpgc.rpg129097.model.Personaggio;

    public interface Validabile {
        void setAffidabile(boolean affidabile);
        boolean isAffidabile();
        String getDescrizione();
        Personaggio getFonte();
    }