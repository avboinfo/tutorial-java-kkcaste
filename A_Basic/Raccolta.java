import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;


public class Raccolta{
    
    ArrayList<Videogame> list;
    Scanner leggiFile;

    public Raccolta(String file){
        try{
            File f=new File(file);
            leggiFile=new Scanner(f);
            while(leggiFile.hasNextLine()){
                String line=leggiFile.nextLine();
                String[] fields=line.split(",");
                list.add(new Videogame(fields[0],fields[1],Integer.parseInt(fields[2]),Float.parseFloat(fields[3])));
               
            }
        }catch(Exception e){
            System.out.println("Errore:"+e);
        }
        leggiFile.close();
       
    }
    public String toString(){
        String s="";
        for(int i=0;i<list.size();i++){
            s+=list.get(i)+"\n";
        }
        return s;
    }
     
}