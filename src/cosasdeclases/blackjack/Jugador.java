package cosasdeclases.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Jugador {

    private int id;
    private List<Carta>mano;
    private int valormano;
    private boolean planta;
    private int contador;
    private boolean gana;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Carta> getMano() {
        return mano;
    }

    public void setMano(List<Carta> mano) {
        this.mano = mano;
    }

    public int getValormano() {
        return valormano;
    }

    public void setValormano(int valormano) {
        this.valormano = valormano;
    }

    public boolean isPlanta() {
        return planta;
    }

    public void setPlanta(boolean planta) {
        this.planta = planta;
    }



    public Jugador(int id) {
        this.id = id;
        this.mano = new ArrayList<Carta>();
        this.planta = false;
        this.valormano = valormano;
        this.contador = 0;
        this.gana = false;

    }

    public boolean isGana() {
        return gana;
    }

    public void setGana(boolean gana) {
        this.gana = gana;
    }

    Mazo  mazito =new Mazo();

    public void pedir() {

        mazito.barajar();
        this.mano.add(mazito.sacarcarta());
        mazito.quitar();

        this.valormano += mano.get(contador).getVal();
        contador++;
    }

    public String plantarse() {

        this.planta = true;

        // for(int i = 0; i< contador; i++){
        //   this.valormano += mano.get(i).getVal();
        //}



        String res =
                String.valueOf(this.valormano);

        return res;
    }
}
