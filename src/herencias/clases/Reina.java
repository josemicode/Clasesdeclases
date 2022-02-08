package herencias.clases;

import herencias.abstractas._Figura;

public class Reina extends _Figura {

    public Reina(String color) {
        super(color);
    }

    @Override
    public void movimiento(Casilla casilla2) {
        for(int i = 1; i<=7; i++) {
            if((((casilla2.getNumero()== getCas().getNumero() + i) || (casilla2.getNumero()== getCas().getNumero() - i)) && ((casilla2.getLetra()== getCas().getLetra() + i) || (casilla2.getLetra()== casilla2.getLetra() - i))) || ((getCas().getLetra() == casilla2.getLetra())||(getCas().getNumero() == casilla2.getNumero()))) {
                setCas(casilla2);
            }
        }
    }

    @Override
    public String toString() {
        String res = "";

        if(getColor().equals("n")){
            res += "Q-n";
        }else if (getColor().equals("b")){
            res += "Q-b";
        }

        return res;
    }
}
