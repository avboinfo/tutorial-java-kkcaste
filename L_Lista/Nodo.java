import java.io.*;
public class Nodo {

    private int valore;
    private Nodo successivo;

    public Nodo( int valore, Nodo successivo ){
        this.valore = valore;
        this.successivo=successivo;
    }

    public void setValore( int nuovoValore ){
        valore = nuovoValore;

    }

    public void setSuccessivo( Nodo nodoSuccessivo ){
        successivo=nodoSuccessivo;
    }

    public int getValore( ){
        return valore;
    }

    public Nodo getSuccessivo( ){
        return successivo;
    }

    public String toString(){
        return "[ "+valore+" ]";
    }
    
    
}
