package herencias.elmainsito;

import herencias.clases.Caballo;
import herencias.clases.Tablero;
import herencias.clases.Torre;

public class mainAjedrezzzz {
    public static void main(String[] args) {
        Tablero tabs = new Tablero();


        Caballo caballo1 = new Caballo("b");

        Torre torre1 = new Torre("n");


        tabs.getCasillas().get(1).setFigura(caballo1);

        tabs.getCasillas().get(12).setFigura(torre1);

        caballo1.setCas(tabs.getCasillas().get(1));

        torre1.setCas(tabs.getCasillas().get(12));

        tabs.mover(caballo1, tabs.getCasillas().get(11));
        tabs.mover(caballo1, tabs.getCasillas().get(17));
        tabs.mover(caballo1, tabs.getCasillas().get(2));

        tabs.mover(torre1, tabs.getCasillas().get(60));
        tabs.mover(torre1, tabs.getCasillas().get(63));


        System.out.println(tabs.toString());
    }
}
