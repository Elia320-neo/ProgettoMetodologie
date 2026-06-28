    package it.unicam.cs.mpgc.rpg129097.interfaces;
    import it.unicam.cs.mpgc.rpg129097.model.Personaggio;

    public interface Validabile {
        void setVerificato(boolean verificato);
        void setAffidabile(boolean affidabile);
        boolean isAffidabile();
        Personaggio getProprietario();
    }