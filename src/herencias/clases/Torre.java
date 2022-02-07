package herencias.clases;

import herencias.abstractas._Figura;

public class Torre extends _Figura {

    public Torre(String color) {
        super(color);
    }

    @Override
    public void movimiento() {

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
