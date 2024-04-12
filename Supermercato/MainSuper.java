package Supermercato;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MainSuper {
    public static void main(String[] args) throws IOException {
        

            Spesa s = new Spesa();
           
           

            Scanner userInput=new Scanner(System.in);
            //System.out.print("Cosa vuoi fare?\n-Carica prodotto [c]\n-Trova prodotto dal codice [f]\n-Stampa prodotti [s]\n-Esci [e]\n");
            //String scelta=userInput.nextLine().toLowerCase();
            

            System.out.print("Inserisci codice da cercare: ");
           
            String c=userInput.nextLine();
            System.out.println(Spesa.cercaProdotto(c));



            System.out.println(s);
            System.out.println("Costo totale: ");

            System.out.println(Spesa.calcoloCosto());
            
            System.out.println(s);
            


    
            
        
    }
}
