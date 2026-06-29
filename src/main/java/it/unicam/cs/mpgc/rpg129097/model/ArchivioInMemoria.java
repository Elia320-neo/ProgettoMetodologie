    package it.unicam.cs.mpgc.rpg129097.model;

    import it.unicam.cs.mpgc.rpg129097.interfaces.ArchivioInformazioni;

    import java.util.HashMap;
    import java.util.Map;
    //TODO refactor: valutare implementazione HashMap
    public class ArchivioInMemoria implements ArchivioInformazioni {
        private final Map<String, Boolean> esiti;

        public ArchivioInMemoria() {
            this.esiti = new HashMap<>();
        }

        @Override
        public boolean getEsito(String descrizione){
            return esiti.getOrDefault(descrizione, false);
        }


    }
