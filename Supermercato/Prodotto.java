package Supermercato;

public class Prodotto {
    String codice,descrizione;
    double costo;
    public Prodotto(String codice,String descrizione,double costo){
        this.codice=codice;
        this.descrizione=descrizione;
        this.costo=costo;

    }

    public void setCodice(String codice){
        this.codice=codice;
    }

    public String getCodice(){
        return codice;
    }
    

    public String getDescrizione() {
        return descrizione;
    }


    public double getCosto() {
        return costo;
    }

    

    public String toString(){
        String s="Codice prodotto: "+codice+"; Prezzo: "+costo+"; Descrizione: "+descrizione;
        return s;
    }
}
