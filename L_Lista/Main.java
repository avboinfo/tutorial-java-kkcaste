//import java.util.Scanner;

import BinarySearchTree.Nodo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Partiti!");
        Lista l=new Lista();        


       
l.addSorted(new Nodo(3,null));
l.addSorted(new Nodo(6,null));
l.addSorted(new Nodo(87,null));
l.addSorted(new Nodo(55,null));
l.addSorted(new Nodo(25,null));
l.addSorted(new Nodo(43,null));

System.out.println(l);

l.addAfter(3, new Nodo(1492,null));

System.out.println(l);



/*
        Lista l=new Lista();
        Scanner input = new Scanner(System.in);
        int scelta;

        do{
            System.out.println("Cosa vuoi fare? \n[1] Aggiungi nodo in testa\n[2] Aggiungi nodo in coda\n[3] Aggiungi nodo Sorted\n[0] Esci");
            scelta=input.nextInt();

            switch (scelta) {
                case 1:
                    l.addHead(new Nodo(1,null));
                    break;
                case 2:
                    l.addTail(new Nodo(2,null));
                case 3:
                    l.addSorted(new Nodo(3,null));
            
                default:
                    
                    break;
            }
            System.out.println(l);

        }while(scelta!=0);
*/

        
    }
    
}
