package E_Email;

public class Nodo<T> {
    private T valore;
    private Nodo<T> successivo;

    public Nodo(T valore){
        this.valore=valore;
        successivo=null;
    }

    public T getValore(){
        return valore;
    }

    public void setValore(T valore){
        this.valore=valore;
    }

    public Nodo<T> getSuccessivo(){
        return successivo;
    }

    public void setSuccessivo(Nodo<T> successivo){
        this.successivo=successivo;
    }

    public String toString(){
        return "Valore: "+valore;
    }
}

