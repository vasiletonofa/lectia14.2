package animal;

public class Urs extends Animal implements Carnivor, Erbivor {

    @Override
    public void manancaCarne() {
        System.out.println("Mananc carne Urs");
    }
}
