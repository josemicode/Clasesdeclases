package herencias.clases;

import herencias.abstractas._Figura;

public class Reina extends _Figura {

    public Reina(String color) {
        super(color);
    }

    @Override
    public void movimiento(Casilla casilla2) {

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
