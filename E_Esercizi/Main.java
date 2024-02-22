package E_Esercizi;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main( String[] args ) {

        Pila<String> p=new Pila<String>();
        
            
        try{
            File f=new File("E_Esercizi/datiIn.txt");
            Scanner leggiFile=new Scanner(f);
            while(leggiFile.hasNextLine()){
                String s=leggiFile.nextLine();
                p.push(s);
                
            }

        }catch(Exception e){
            System.out.println("Errore: "+e);
        }
        
            

            System.out.println(p);

    }
}
