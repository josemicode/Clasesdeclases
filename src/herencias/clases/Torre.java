package herencias.clases;

import herencias.abstractas._Figura;

public class Torre extends _Figura {

    public Torre(String color) {
        super(color);
    }

    @Override
    public void movimiento(Casilla casilla2) {
        if((getCas().getLetra() == casilla2.getLetra())||(getCas().getNumero() == casilla2.getNumero())) {
            setCas(casilla2);
        }
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
