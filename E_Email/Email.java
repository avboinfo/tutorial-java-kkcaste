package E_Email;

public class Email {
    
    String mittente,oggetto,testo;

    public Email(String mittente,String oggetto,String testo){
        
        this.mittente=mittente;
        this.oggetto=oggetto;
        this.testo=testo;
    }

    public String getMittente() {
        return mittente;
    }

    public void setMittente(String mittente) {
        this.mittente = mittente;
    }

    public String getOggetto() {
        return oggetto;
    }

    public void setOggetto(String oggetto) {
        this.oggetto = oggetto;
    }

    public String getTesto() {
        return testo;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }

    @Override
    public String toString() {
        return "Email [mittente=" + mittente + ", oggetto=" + oggetto + ", testo=" + testo + "]";
    }

    
    

    
}
