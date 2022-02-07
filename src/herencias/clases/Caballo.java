package herencias.clases;

import herencias.abstractas._Figura;

public class Caballo extends _Figura {

    public Caballo(String color) {
        super(color);
    }

    @Override
    public void movimiento() {

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
