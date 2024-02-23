/*
** Esempio di uso di uno Stack (Pila)
** Sandro Gallo - 08/02/2024
*/

package S_Stack;

import java.io.FileWriter;
import java.io.IOException;
import java.io.File;


public class Main {

    public static void main( String[] args ) throws IOException {
        
        Stack<String> s = new Stack<>();
       
        File f=new File("S_Stack/dati.txt");
        FileWriter writer = new FileWriter(f); 
        writer.write("Ciao");
        
        
        System.out.println(s);
    }

}
