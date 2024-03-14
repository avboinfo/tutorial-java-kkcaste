import java.util.ArrayList;


public class ProveArrayList{

    public static void main (String[] args){
        System.out.println("Program started");

        ArrayList<String> a=new ArrayList<>();
        a.add("Uno");
        a.add("Due");
        a.add("Tre");
        a.add("Quattro");
        a.add("Cinque");
        a.add("Sei");
        a.add(1,"Uno virgola cinque");

        //Collections.sort(a);  
        for(String i : a){
            System.out.println(i);
        }

        System.out.println(a);

        //System.out.println("j".compareTo("p"));


        
    }

}