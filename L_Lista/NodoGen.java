public class NodoGen<T> {
    private T valore;
    private NodoGen<T> successivo;

    public NodoGen(T valore){
        this.valore=valore;
        successivo=null;
    }

    public T getValore(){
        return valore;
    }

    public void setValore(T valore){
        this.valore=valore;
    }

    public NodoGen<T> getSuccessivo(){
        return successivo;
    }

    public void setSuccessivo(NodoGen<T> successivo){
        this.successivo=successivo;
    }

    public String toString(){
        return "Valore: "+valore;
    }
}
