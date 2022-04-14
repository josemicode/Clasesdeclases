package herencias.clases;

import herencias.abstractas._Figura;

public class Torre extends _Figura {

    public Torre(String color) {
        super(color);
    }

    @Override
    public void movimiento(Casilla casilla2, Tablero tablas) {
        /*if((getCas().getLetra() == casilla2.getLetra())||(getCas().getNumero() == casilla2.getNumero())) {
            setCas(casilla2);
        }*/
        boolean bool = false;

        if (getCas().getNumero() == casilla2.getNumero()) {
            if (casilla2.getPos() > getCas().getPos()) {
                for (int i = getCas().getPos() + 1; i < casilla2.getPos(); i++) {
                    if (!(tablas.getCasillas().get(i).getFigura()==null)) {
                        bool = true;
                    }
                }
                if (!bool) {
                    setCas(casilla2);
                    this.movida = true;
                    bool=!bool;
                }
            }

            if (casilla2.getPos() < getCas().getPos()) {
                for (int i = getCas().getPos() - 1; i > casilla2.getPos(); i--) {
                    if (!(tablas.getCasillas().get(i).getFigura()==null)) {
                        bool = true;
                    }
                }
                if (!bool) {
                    setCas(casilla2);
                    this.movida = true;
                    bool=!bool;
                }
            }
        }

        if (((casilla2.getNumero() == getCas().getNumero() + 1) && (casilla2.getLetra() == getCas().getLetra()))
                ||
                ((casilla2.getNumero() == getCas().getNumero() - 1) && (casilla2.getLetra() == getCas().getLetra()))
                ||
                ((casilla2.getNumero() == getCas().getNumero()) && (casilla2.getLetra() == getCas().getLetra() + 1))
                ||
                ((casilla2.getNumero() == getCas().getNumero()) && (casilla2.getLetra() == getCas().getLetra() - 1))){

            setCas(casilla2);
            this.movida = true;
        }

        if (getCas().getLetra() == casilla2.getLetra()) {
            if (casilla2.getPos() > getCas().getPos()) {
                for (int i = getCas().getPos() + 8; i < casilla2.getPos(); i+=8) {
                    if (!(tablas.getCasillas().get(i).getFigura()==null)) {
                        bool = true;
                    }
                }
                if (!bool) {
                    setCas(casilla2);
                    this.movida = true;
                    bool=!bool;
                }
            }

            if (casilla2.getPos() < getCas().getPos()) {
                for (int i = getCas().getPos() - 8; i > casilla2.getPos(); i-=8) {
                    if (!(tablas.getCasillas().get(i).getFigura()==null)) {
                        bool = true;
                    }
                }
                if (!bool) {
                    setCas(casilla2);
                    this.movida = true;
                    bool=!bool;
                }
            }
        }/*else if ((casilla2.getLetra() == getCas().getLetra() + 1)||(casilla2.getLetra() == getCas().getLetra() - 1)){
            setCas(casilla2);
        }*/
    }

    @Override
    public String toString() {
        String res = "";

        if(getColor().equals("n")){
            res += "T-n";
        }else if (getColor().equals("b")){
            res += "T-b";
        }

        return res;
    }
}
