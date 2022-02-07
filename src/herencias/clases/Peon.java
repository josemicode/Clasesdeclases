package herencias.clases;

import herencias.abstractas._Figura;

public class Peon extends _Figura {

    public Peon(String color) {
        super(color);
    }

    @Override
    public void movimiento(Casilla casilla2) {

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
