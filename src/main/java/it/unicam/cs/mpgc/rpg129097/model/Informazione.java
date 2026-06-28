    package it.unicam.cs.mpgc.rpg129097.model;

    import it.unicam.cs.mpgc.rpg129097.interfaces.Validabile;

    public class Informazione implements Validabile {
        private String descrizione;
        private Personaggio fonte;

        /** true se l'informazione è vera */
        private boolean esito;

        /** true se garantisce la verità o falsità dell'informazione */
        private boolean affidabile;

        public Informazione(String descrizione, Personaggio fonte){
            if(descrizione == null) throw new NullPointerException("descrizione non può essere nulla");
            if(fonte == null) throw new NullPointerException("fonte non può essere nulla");
            this.descrizione = descrizione;
            this.fonte = fonte;
        }

        public String getDescrizione(){return this.descrizione;}

        @Override
        public Personaggio getFonte(){return this.fonte;}

        @Override
        public void setAffidabile(boolean affidabile){this.affidabile = affidabile;}

        @Override
        public boolean isAffidabile(){return this.affidabile;}

        @Override
        public void setEsito(boolean esito){this.esito = esito;}

        @Override
        public boolean getEsito(){return this.esito;}

    }
