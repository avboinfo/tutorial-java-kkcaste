import java.io.File;  
import java.io.PrintWriter;  


public class ProveFile{
    public static void main(String[] args){

    File f=new File("random.csv");
    try{
        PrintWriter scrittore=new PrintWriter( f);
        for(int i=0;i<10;i++){
            scrittore.printf("%05.2f\t%05.2f\n, Math.random()*100 , Math.random()*100");

        }   
        scrittore.close();
        
     }catch(Exception e){
        e.printStackTrace();
     }
}
}