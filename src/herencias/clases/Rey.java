package herencias.clases;

import herencias.abstractas._Figura;

public class Rey extends _Figura {

    public Rey(String color) {
        super(color);
    }

    @Override
    public void movimiento(Casilla casilla2) {
        if((((casilla2.getNumero()== getCas().getNumero() + 1) || (casilla2.getNumero()== getCas().getNumero() - 1)) || ((casilla2.getLetra()== getCas().getLetra() + 1) || (casilla2.getLetra()== getCas().getLetra() - 1))) || ((casilla2.getNumero()== getCas().getNumero() +1) && (casilla2.getLetra()== getCas().getLetra() +1)) || ((casilla2.getNumero()== getCas().getNumero() +1) && (casilla2.getLetra()== getCas().getLetra() -1)) || ((casilla2.getNumero()== getCas().getNumero() -1) && (casilla2.getLetra()== getCas().getLetra() -1)) || ((casilla2.getNumero()== getCas().getNumero() -1) && (casilla2.getLetra()== getCas().getLetra() +1)) ) {
            setCas(casilla2);
        }
    }

    @Override
    public String toString() {
        String res = "";

        if(getColor().equals("n")){
            res += "K-n";
        }else if (getColor().equals("b")){
            res += "K-b";
        }

        return res;
    }
}
