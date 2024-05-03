package BinarySearchTree;

public class Nodo {
    Nodo figlio_sx;
    Nodo figlio_dx;
    double valore;

    public Nodo(Nodo figlio_sx, Nodo figlio_dx, double valore) {
        this.figlio_sx = figlio_sx;
        this.figlio_dx = figlio_dx;
        this.valore=valore;
    }

    public Nodo(double valore){
        this(null,null,valore); //Richiamo il primo costruttore per risparmiare codice
    }

    public Nodo getFiglio_sx() {
        return figlio_sx;
    }

    public void setFiglio_sx(Nodo figlio_sx) {
        this.figlio_sx = figlio_sx;
    }

    public Nodo getFiglio_dx() {
        return figlio_dx;
    }

    public void setFiglio_dx(Nodo figlio_dx) {
        this.figlio_dx = figlio_dx;
    }

    public double getValore() {
        return valore;
    }

    public void setValore(double valore) {
        this.valore = valore;
    }

    @Override
    public String toString() {
        return String.valueOf(valore);
    }

    boolean eFoglia(){
        return figlio_sx==null && figlio_dx==null;
    }

}
