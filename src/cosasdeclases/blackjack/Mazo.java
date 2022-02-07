package cosasdeclases.blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mazo {

    private int numcard;
    private List<Carta>cartitas;

    public Mazo() {
        this.numcard = 52;
        this.cartitas = new ArrayList<Carta>();
        for(int i = 0; i<4; i++){
            for(int j = 1; j<=13; j++){
                this.cartitas.add(new Carta(i, j));
            }
        }
    }

    public int getNumcard() {
        return numcard;
    }

    public void setNumcard(int numcard) {
        this.numcard = numcard;
    }

    public ArrayList<Carta> getCartitas() {
        return (ArrayList<Carta>) cartitas;
    }

    public void setCartitas(ArrayList<Carta> cartitas) {
        this.cartitas = cartitas;
    }

    public void barajar() {
        Collections.shuffle(cartitas);
    }

    public Carta sacarcarta() {
        Carta cardvalue = cartitas.get(0);
        //String res = String.valueOf(cartitas.get(0));
        return cardvalue;
    }

    public void quitar() {
        cartitas.remove(0);
    }

}

