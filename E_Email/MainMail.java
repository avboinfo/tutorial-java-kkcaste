package E_Email;

public class MainMail {
    public static void main(String[] args) {
        MailBox m=new MailBox();
        System.out.println(m);
        System.out.println(m.cercaNelTesto("Ciao sono mario, sesso free?"));
    }
}
