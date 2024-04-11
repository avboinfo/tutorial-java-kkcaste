package E_Email;

public class MailBox {
    Lista<Email> mb;

    public MailBox() {
        mb = new Lista<>();
        loadFromFile();
    }

    public String cercaNelTesto( String testo ) {
        String result = "email che contengono " + testo + " nel testo:\n";
        Nodo<Email> e = mb.getRoot();
        while (e!=null) {
            if (e.getValore().getTesto().equals(testo)) {
                result += e + "\n";
            }
            e = e.getSuccessivo();
        }
        return result;
    }

    private void loadFromFile() {
        // per il momento lo facciamo "sdozzo"
        mb.addTail( new Email("Mario", "Sesso hard free", "Ciao sono mario, sesso free?") );
        mb.addTail( new Email("Giova", "Non accetare mail mario", "Mario è un truffatore") );
        mb.addTail( new Email("Paul", "Fai sesso ora", "accetta sesso mario") );
        ;
    }

    @Override
    public String toString() {
        return "MailBox [mb=" + mb + "]";
    }

    
}
