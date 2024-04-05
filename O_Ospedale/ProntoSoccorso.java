package O_Ospedale;

public class ProntoSoccorso {
    Lista<Paziente> ps;

    public ProntoSoccorso(){
        ps=new Lista();
        loadFromFile();
    }

    private void loadFromFile(){
        //per ora fake
        ps.addTail(new Paziente("Mario","Rossi","Giallo"));
        ps.addTail(new Paziente("Gianluca","Riupo","Rosso"));
        ps.addTail(new Paziente("Vincenzo","Giambanco","Bianco"));
    }

    @Override
    public String toString() {
        return "ProntoSoccorso [ps=" + ps + "]";
    }

    
}
