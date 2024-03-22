import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.File;

public class Conto{
    float saldo;
    String nome;
    

    

    public Conto(String nome,float saldo){
        this.saldo=saldo;
        this.nome=nome;
    }
    

    public void versaSoldi(float quantita){//q= quantità soldi da aggiungere
        saldo=saldo+quantita;
        registra("Versamento di "+quantita);
    }
    
    public void prelevaSoldi(float quantita){ //q= quantità soldi da togliere
        if(saldo>=quantita){
            saldo=saldo-quantita;
            registra("Prelevo di "+quantita);
        }else{
            System.out.println("Saldo insufficente.\nI soldi non verranno prelevati.");
            
        }
    }
    public float getSaldo(){
        return saldo;
    }

  


    public void bonifico(Conto contoMittente,float quantita,float interesse){
        
       if(contoMittente.getSaldo()>=quantita){
            contoMittente.prelevaSoldi(quantita+(interesse*100/10));
            

            saldo=saldo+quantita;
            registra("Bonifico di "+quantita+" a "+nome);
            
        }else{
            System.out.println("Saldo insufficente.\nI soldi non verranno inviati.");

        }

    }

    public void registra(String operazione){
        try{
            File f=new File("B_Bank/log.txt");
            FileWriter p=new FileWriter(f,true);
            p.write(operazione+"\n");
            p.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public String toString(){
        String s="Soldi di "+nome+" "+saldo+"€";
        return s;
    }
}