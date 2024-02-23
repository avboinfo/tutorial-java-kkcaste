package E_Esercizi;

import java.util.ArrayList;

public class Pila <T> {
    ArrayList<T> list;

    public Pila(){
        list=new ArrayList<T>();
    }

    public void push(T elemento){
        list.add(elemento);
        
    }

    public T pop(){
        int size=list.size();
        if(size==0) return null;
        T x = list.get(size-1);
        list.remove(x);
        return x;

    }

    public String toString(){
        String s="PIla:\n";
        for(int i=list.size()-1;i>=0;i--){
           s+=list.get(i)+"\n";
        }
        return s;
    }
}
