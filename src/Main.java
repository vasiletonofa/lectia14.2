import animal.Animal;
import animal.Carnivor;
import animal.Leu;
import animal.Urs;

public class Main {
    public static void main(String[] args) {
        Leu leu = new Leu();
        leu.setAge(5);
        leu.manancaCarne();

        System.out.println(leu.getAge());

        Carnivor carnivor1 = new Leu();

        Carnivor carnivor2 = new Urs();

        mananca(new Leu());
        mananca(new Urs());

    }


    public static void mananca(Carnivor carnivor) {
        carnivor.manancaCarne();
    }
}