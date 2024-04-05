package O_Ospedale;

public class Lista<T> {
    Nodo<T> root;

    public Lista() {
        this.root = null;
    }

    public void addTail (T v){
        addTail(new Nodo<T>(v));
    }

    public void addTail(Nodo<T> n){
        if(root == null){
            root = n;
        } else {
            Nodo<T> tmp = root;
            while(tmp.getSuccessivo()!=null){
                tmp = tmp.getSuccessivo();
            }
            tmp.setSuccessivo(n);
        }
    }

    @Override
    public String toString() {
        String s = "Elementi della lista:\n";
        Nodo<T> tmp = root;
        while (tmp!=null) {
            s += tmp + "\n";
            tmp = tmp.getSuccessivo();
        }
        s += "End!\n";
        return s;
    }
}
