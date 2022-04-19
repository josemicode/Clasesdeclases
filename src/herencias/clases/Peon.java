package herencias.clases;

import herencias.abstractas._Figura;

public class Peon extends _Figura {

    public Peon(String color) {
        super(color);
    }

    @Override
    public void movimiento(Casilla casilla2, Tablero tablas) {
        /*if((getColor().equals("b") && (casilla2.getNumero()== getCas().getNumero() + 1)) || ((getColor().equals("n")) && (casilla2.getNumero()== getCas().getNumero() -1))) {
            setCas(casilla2);
        }*/

        if (getColor().equals("b")) {

            if (getCas().getNumero()==1) {
                if ((tablas.getCasillas().get(getCas().getPos() + 8).getFigura()==null)
                    &&
                    (tablas.getCasillas().get(getCas().getPos() + 16).getFigura()==null)
                    &&
                    ((casilla2.getNumero() == getCas().getNumero() + 2) && (casilla2.getLetra() == getCas().getLetra()))) {

                    setCas(casilla2);
                    this.movida = true;
                }
            }

            if ((casilla2.getNumero() == getCas().getNumero() + 1) && (casilla2.getLetra() == getCas().getLetra())) {
                if (casilla2.getFigura()==null) {
                    setCas(casilla2);
                    this.movida = true;
                }
            }

            if (((casilla2.getNumero() == getCas().getNumero() + 1) && (casilla2.getLetra() == getCas().getLetra() - 1))
                ||
                ((casilla2.getNumero() == getCas().getNumero() + 1) && (casilla2.getLetra() == getCas().getLetra() + 1))) {
                if (!(casilla2.getFigura()==null)) {
                    setCas(casilla2);
                    this.movida = true;
                }
            }
        }

        if (getColor().equals("n")) {

            if(getCas().getNumero()==6) {

                if ((tablas.getCasillas().get(getCas().getPos() - 8).getFigura()==null)
                        &&
                        (tablas.getCasillas().get(getCas().getPos() - 16).getFigura()==null)
                        &&
                        ((casilla2.getNumero() == getCas().getNumero() - 2) && (casilla2.getLetra() == getCas().getLetra()))) {

                    setCas(casilla2);
                    this.movida = true;
                }
            }

            if ((casilla2.getNumero() == getCas().getNumero() - 1) && (casilla2.getLetra() == getCas().getLetra())) {
                if (casilla2.getFigura()==null) {
                    setCas(casilla2);
                    this.movida = true;
                }
            }

            if (((casilla2.getNumero() == getCas().getNumero() - 1) && (casilla2.getLetra() == getCas().getLetra() - 1))
                    ||
                    ((casilla2.getNumero() == getCas().getNumero() - 1) && (casilla2.getLetra() == getCas().getLetra() + 1))) {
                if (!(casilla2.getFigura()==null)) {
                    setCas(casilla2);
                    this.movida = true;
                }
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