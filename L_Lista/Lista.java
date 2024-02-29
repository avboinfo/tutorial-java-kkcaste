public class Lista {
    Nodo radice;

    public Lista(){
        radice = null;
    }

    public boolean isEmpty(){
        return radice==null;

    }

    public void add(Nodo n){
        if(isEmpty()){
            radice = n;
        }else{
            Nodo p=radice;
            while(p.getSuccessivo()!=null) p=p.getSuccessivo();
            p.setSuccessivo(n);
            
        }
        Nodo p = radice;
    }

    public String toString(){
        String s="Elementi lista:\n";
        Nodo p= radice;
        
        while (p!=null) {
            
            s=s+p;
            p=p.getSuccessivo();
            
        }
        return s;
    }
}
