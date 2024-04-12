package Supermercato;
import java.util.Scanner;

import java.io.*;


public class Spesa {
    static Lista<Prodotto> lp;

    public Spesa() {
        lp = new Lista<>();
        loadFromFile();
    }

    public static String cercaProdotto( String codice ) throws IOException {
        String result = "Prodotto con codice: " + codice + ":\n";
        Nodo<Prodotto> p = lp.getRoot();
        while (p!=null) {
            if (p.getValore().getCodice().equals(codice)) {
                result += p + "\n";
            }
            p = p.getSuccessivo();
        }
        return result;
    }

    private void loadFromFile() {
        Scanner leggiFile;
        try{
            File f=new File("Supermercato/prodotti.csv");
            leggiFile=new Scanner(f);
            while(leggiFile.hasNextLine()){
                String line=leggiFile.nextLine();
                String[] fields=line.split(",");
                lp.addTail(new Prodotto(fields[0], fields[1], Double.parseDouble(fields[2])));
               
            }
        }catch(Exception e){
            System.out.println("Errore:"+e);
        }
       

    }

    public static double calcoloCosto(){
        Scanner leggiFile;
        double costoT=00.00;
        try{
            File f=new File("Supermercato/prodotti.csv");
            leggiFile=new Scanner(f);
            while(leggiFile.hasNextLine()){
                String line=leggiFile.nextLine();
                String[] fields=line.split(",");
                costoT+=Double.parseDouble(fields[2]);
               
            }
        }catch(Exception e){
            System.out.println("Errore:"+e);
        }
        return costoT;
    }

    @Override
    public String toString() {
        return "Spesa: " + lp;
    }
    
}
