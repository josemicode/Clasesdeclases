package herencias.clases;

import herencias.abstractas._Figura;

public class Peon extends _Figura {

    public Peon(String color) {
        super(color);
    }

    @Override
    public void movimiento(Casilla casilla2, Tablero tablas) {
        /*
        if((getColor().equals("b") && (casilla2.getNumero()== getCas().getNumero() + 1)) || ((getColor().equals("n")) && (casilla2.getNumero()== getCas().getNumero() -1))) {
        }*/

        if (getColor().equals("b")) {
            if (((casilla2.getNumero()== getCas().getNumero() + 1) && (casilla2.getFigura()==null))
                    ||
                        ((getCas().getNumero() == 1) && (casilla2.getNumero()== getCas().getNumero() + 2) && (tablas.getCasillas().get(getCas().getPos() + 8).getFigura() == null) && (tablas.getCasillas().get(getCas().getPos() + 16).getFigura() == null))
                    ||
                        ((casilla2.getFigura() != null) && ((casilla2.getPos() == getCas().getPos() + 9) || (casilla2.getPos() == getCas().getPos() + 7)))) {

                setCas(casilla2);
            }
        }

        if (getColor().equals("n")) {
            if (((casilla2.getNumero()== getCas().getNumero() - 1) && (casilla2.getFigura()==null))
                    ||
                        ((getCas().getNumero() == 6) && (casilla2.getNumero()== getCas().getNumero() - 2) && (tablas.getCasillas().get(getCas().getPos() - 8).getFigura() == null) && (tablas.getCasillas().get(getCas().getPos() - 16).getFigura() == null))
                    ||
                        ((casilla2.getFigura() != null) && ((casilla2.getPos() == getCas().getPos() - 9) || (casilla2.getPos() == getCas().getPos() - 7)))) {

                setCas(casilla2);
            }
        }
    }


    @Override
    public String toString() {
        String res = "";

        if(getColor().equals("n")){
            res += "P-n";
        }else if (getColor().equals("b")){
            res += "P-b";
        }

        return res;
    }
}
// pepe