    package it.unicam.cs.mpgc.rpg129097.model;

    import it.unicam.cs.mpgc.rpg129097.interfaces.ArchivioEsiti;

    import java.util.Map;

    public class ArchivioEsitiMemoria implements ArchivioEsiti {
        private final Map<String, Boolean> esiti;

        public ArchivioEsitiMemoria(Map<String, Boolean> esiti) {
            this.esiti = esiti;
        }


        @Override
        public boolean getEsito(String descrizione){
            return esiti.getOrDefault(descrizione, false);
        }

        public void aggiungiEsito(String descrizione, boolean esito){ esiti.put(descrizione,esito);}

        public boolean contiene(String descrizione){return esiti.containsKey(descrizione);}

        public void rimuovi(String descrizione){esiti.remove(descrizione);}

    }
