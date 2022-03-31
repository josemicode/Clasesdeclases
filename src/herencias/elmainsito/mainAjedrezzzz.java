package herencias.elmainsito;

import herencias.clases.*;

public class mainAjedrezzzz {
    public static void main(String[] args) {
        Tablero tabs = new Tablero();

        //---------------------------------------------------------------------------------------------

        //Caballo caballo1 = new Caballo("b");

        //Torre torre1 = new Torre("n");

        Alfil alfil1 = new Alfil("b");

        //Reina reina1 = new Reina("n");

        //Rey rey1 = new Rey("b");

        //Peon peon1 = new Peon("n");
        //Peon peon2 = new Peon("b");

        //---------------------------------------------------------------------------------------------

        //tabs.getCasillas().get(1).setFigura(caballo1);

        //tabs.getCasillas().get(12).setFigura(torre1);

        tabs.getCasillas().get(0).setFigura(alfil1);

        //tabs.getCasillas().get(7).setFigura(reina1);

        //tabs.getCasillas().get(54).setFigura(rey1);

        //tabs.getCasillas().get(5).setFigura(peon1);
        //tabs.getCasillas().get(59).setFigura(peon2);

        //---------------------------------------------------------------------------------------------

        //caballo1.setCas(tabs.getCasillas().get(1));

        //torre1.setCas(tabs.getCasillas().get(12));

        alfil1.setCas(tabs.getCasillas().get(0));

        //reina1.setCas(tabs.getCasillas().get(7));

        //rey1.setCas(tabs.getCasillas().get(54));

        //peon1.setCas(tabs.getCasillas().get(5));
        //peon2.setCas(tabs.getCasillas().get(59));

        //---------------------------------------------------------------------------------------------

        //tabs.mover(caballo1, tabs.getCasillas().get(11));
        //tabs.mover(caballo1, tabs.getCasillas().get(17));
        //tabs.mover(caballo1, tabs.getCasillas().get(2));

        //tabs.mover(torre1, tabs.getCasillas().get(60));
        //tabs.mover(torre1, tabs.getCasillas().get(63));

        tabs.mover(alfil1, tabs.getCasillas().get(9));
        tabs.mover(alfil1, tabs.getCasillas().get(2));
        tabs.mover(alfil1, tabs.getCasillas().get(9));

        //tabs.mover(reina1, tabs.getCasillas().get(2));
        //tabs.mover(reina1, tabs.getCasillas().get(20));

        //tabs.mover(rey1, tabs.getCasillas().get(62));

        //tabs.mover(peon1, tabs.getCasillas().get(13));
        //tabs.mover(peon2, tabs.getCasillas().get(52));

        //---------------------------------------------------------------------------------------------

        System.out.println(tabs.toString());

    }
}
