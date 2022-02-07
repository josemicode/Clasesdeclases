package cosasdeclases.blackjack;

public class COMPROB {
    public static void main(String[] args) {

        Mazo mazado = new Mazo();
        Jugador Elpepe = new Jugador(9);

        //mazado.barajar();
        //System.out.println(mazado.sacarcarta());
        //System.out.println(mazado.getCartitas());


        Elpepe.pedir();

        Elpepe.pedir();

        Elpepe.pedir();

        System.out.println(Elpepe.getMano());

    }
}

