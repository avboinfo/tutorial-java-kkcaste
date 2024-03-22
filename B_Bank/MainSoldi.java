public class MainSoldi {
    public static void main(String[] args) {
        //creo conto 1  
        Conto contoDiGiulietta=new Conto("Giulietta",0);
        //verso e prelevo
        contoDiGiulietta.versaSoldi(2000);
        contoDiGiulietta.prelevaSoldi(500);
        contoDiGiulietta.prelevaSoldi(400);
        
        //stampo saldo 
        
        //new conto
        Conto contoDiRomeo=new Conto("Romeo",0);
        contoDiRomeo.bonifico(contoDiGiulietta, 200,10);
        System.out.println(contoDiGiulietta);
        System.out.println(contoDiRomeo);
    }
    
}
