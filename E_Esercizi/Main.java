package E_Esercizi;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

public class Main {
    public static void main( String[] args ) {

        Pila<String> p=new Pila<String>();
        
            
        try{
            File fIn=new File("E_Esercizi/datiIn.txt");
            File fOut=new File("E_Esercizi/datiOut.txt");
            Scanner leggiFile=new Scanner(fIn);
            while(leggiFile.hasNextLine()){
                String s=leggiFile.nextLine();
                p.push(s);
                FileWriter myWriter = new FileWriter(fOut);
                myWriter.write(p+"");
                myWriter.close();
                
            }
            leggiFile.close();

        }catch(Exception e){
            System.out.println("Errore: "+e);
        }
        

    }
}
