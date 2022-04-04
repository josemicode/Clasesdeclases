package herencias.clases;

import herencias.abstractas._Figura;

public class Caballo extends _Figura {

    public Caballo(String color) {
        super(color);
    }

    @Override
    public void movimiento(Casilla casilla2, Tablero tablas) {
        if((((casilla2.getNumero()== getCas().getNumero() - 2)||(casilla2.getNumero()== getCas().getNumero() + 2)) && ((casilla2.getLetra()== getCas().getLetra() - 1)||(casilla2.getLetra()== getCas().getLetra() + 1)))||(((casilla2.getNumero()== getCas().getNumero() - 1)||(casilla2.getNumero()== getCas().getNumero() + 1)) && ((casilla2.getLetra()== getCas().getLetra() - 2)||(casilla2.getLetra()== getCas().getLetra() + 2)))) {
            setCas(casilla2);
        }
    }

    @Override
    public String toString() {
        String res = "";

        if(getColor().equals("n")){
            res += "C-n";
        }else if (getColor().equals("b")){
            res += "C-b";
        }

        return res;
    }
}
