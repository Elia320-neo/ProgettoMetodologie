    package it.unicam.cs.mpgc.rpg129097.model;

    import it.unicam.cs.mpgc.rpg129097.interfaces.Attribuibile;
    import it.unicam.cs.mpgc.rpg129097.interfaces.Validabile;

    public class Informazione implements Validabile, Attribuibile {
        private String descrizione;
        private Personaggio fonte;


        /** true se è garantita la falsità o verità dell'informazione */
        private boolean affidabile;

        public Informazione(String descrizione, Personaggio fonte){
            if(descrizione == null) throw new NullPointerException("descrizione non può essere null");
            if(fonte == null) throw new NullPointerException("fonte non può essere null");
            this.descrizione = descrizione;
            this.fonte = fonte;
        }


        @Override
        public String getDescrizione(){return this.descrizione;}

        @Override
        public Personaggio getFonte(){return this.fonte;}

        @Override
        public void setAffidabile(boolean affidabile){this.affidabile = affidabile;}

        @Override
        public boolean isAffidabile(){return this.affidabile;}


    }


