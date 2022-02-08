package herencias.clases;

import herencias.abstractas._Figura;

public class Alfil extends _Figura {

    public Alfil(String color) {
        super(color);
    }

    @Override
    public void movimiento(Casilla casilla2) {

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
