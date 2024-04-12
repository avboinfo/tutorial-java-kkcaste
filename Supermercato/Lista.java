package Supermercato;

public class Lista<T> {
    class Iteratore {
        private Nodo nodo;
        private Iteratore(Nodo nodo) {
            this.nodo = nodo;
        }
        public boolean hasNext() {
            return nodo!=null;
        }
        public Nodo next() {
            if (nodo==null) return null;
            // Nodo result = new Nodo( nodo.getValore(), nodo.getSuccessivo() );
            Nodo result = nodo;
            nodo = nodo.getSuccessivo();
            return result;
        }
    }

    public Iteratore getIterator() {
        Iteratore i = new Iteratore(root);
        return i;
    }


    Nodo<T> root;

    public Lista() {
        this.root = null;
    }

    public Nodo<T> getRoot() {
        return root;
    }

    

    public boolean isEmpty() {
        return root==null;
    }

    public void addHead( T v ) {
        Nodo<T> n = new Nodo<>(v);
        if (isEmpty()) root=n;
        else {
            n.setSuccessivo(root);
            root = n;
        }
    }

    public void addTail( T v ) {
        Nodo<T> n = new Nodo<>(v);
        if (root==null) {
            root = n;
        } else {
            Nodo<T> tmp = root;
            while (tmp.getSuccessivo()!=null) tmp=tmp.getSuccessivo();
            tmp.setSuccessivo( n );
        }
    }

    public boolean addAfter( int pos, T v ) {
        Nodo<T> n = new Nodo<>(v);
        // aggiunge il nodo n solo dopo aver oltrepassato il nodo di indice pos
        Nodo<T> tmp = root;
        for (int i=0; i<pos; i++) {
            tmp = root.getSuccessivo();
        }
        Iteratore iter = this.getIterator();

        int i; 
        Nodo npos=null;
        for (i=0; i<pos; i++) {
            if (iter.hasNext()) npos = iter.next();
            else return false;
        }
        n.setSuccessivo(npos.getSuccessivo());
        npos.setSuccessivo(n);
        return true;
    }
    
    public String toString() {
        String s = "\n";
        Nodo<T> tmp = root;
        while (tmp!=null) {
            s += tmp + "\n";
            tmp=tmp.getSuccessivo();
        }
        s += "";
        return s;
    }


}
