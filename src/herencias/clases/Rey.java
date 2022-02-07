package herencias.clases;

import herencias.abstractas._Figura;

public class Rey extends _Figura {

    public Rey(String color) {
        super(color);
    }

    @Override
    public void movimiento() {

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
