public class Videogame{
    String nome, sviluppatori;
    float costo;
    int anno;

    public Videogame(String nome, String sviluppatori, int anno, float costo){
        this.nome=nome;
        this.sviluppatori=sviluppatori;
        this.anno=anno;
        this.costo=costo;

    }

    public String toString(){
        String s="Nome videogioco: "+nome+", fatto da: "+sviluppatori+", costo: "+costo+", pubblicato nel "+anno;
        return s;
    }
}