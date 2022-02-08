package herencias.clases;

import herencias.abstractas._Figura;

public class Alfil extends _Figura {

    public Alfil(String color) {
        super(color);
    }

    @Override
    public void movimiento(Casilla casilla2) {
        for(int i = 1; i<=7; i++) {
            if(((casilla2.getNumero()== getCas().getNumero() + i) || (casilla2.getNumero()== getCas().getNumero() - i)) && ((casilla2.getLetra()== getCas().getLetra() + i) || (casilla2.getLetra()== casilla2.getLetra() - i))) {
                setCas(casilla2);
            }
        }
    }

    @Override
    public String toString() {
        String res = "";

        if(getColor().equals("n")){
            res += "A-n";
        }else if (getColor().equals("b")){
            res += "A-b";
        }

        return res;
    }
}
