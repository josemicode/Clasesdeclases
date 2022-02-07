package cosasdeclases.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Partida {

    private int parId;
    private List<Jugador> player;
    private Mazo mazacion;
    private boolean empatacion;

    public Partida(int parId) {
        this.player = new ArrayList<Jugador>();
        this.parId = parId;
        this.mazacion = new Mazo();
        this.empatacion = false;
    }


    public int getParId() {
        return parId;
    }

    public void setParId(int parId) {
        this.parId = parId;
    }

    public List<Jugador> getPlayer() {
        return player;
    }

    public void setPlayer(List<Jugador> player) {
        this.player = player;
    }

    public Mazo getMazacion() {
        return mazacion;
    }

    public void setMazacion(Mazo mazacion) {
        this.mazacion = mazacion;
    }

    public void Ronda(boolean opcion, int jug) {
        if (opcion==false){
            player.get(jug).plantarse();
        }else{
            player.get(jug).pedir();
        }
    }

    public void showdown(int jug, int jug2) {

        String resultado = "";

        if(((player.get(jug).getValormano()>player.get(jug2).getValormano())&&(player.get(jug).getValormano()<=21))||((player.get(jug2).getValormano()>21)&&!(player.get(jug).getValormano()>21))){

            resultado = "El jugador cuyo Id es " + player.get(jug).getId();

            player.get(jug).setGana(true);

        }else if(((player.get(jug).getValormano()<player.get(jug2).getValormano())&&(player.get(jug2).getValormano()<=21))||((player.get(jug).getValormano()>21)&&!(player.get(jug2).getValormano()>21))) {

            resultado = "El jugador cuyo Id es " + player.get(jug2).getId();

            player.get(jug2).setGana(true);

        }else if (player.get(jug).getValormano()==player.get(jug2).getValormano()){
            resultado = "empate";

            empatacion = true;
        }

    }

    public String minitorneo(int zero, int one) {

        boolean auxiliar = true;

        do {

            showdown(zero, one);

            if (player.get(zero).isGana()) {
                System.out.println("Fuera, " + player.get(1).getId());

                player.get(zero).setGana(false);
                player.remove(one);
            }

            if (player.size()>1) {
                if (player.get(one).isGana()) {
                    System.out.println("Fuera, " + player.get(0).getId());

                    player.get(one).setGana(false);
                    player.remove(zero);
                }
            }

            if (empatacion) {
                System.out.println("Oh no, que pena! un empate, los dos a tomar por culo,\n fuera de aquí jugadores " + player.get(0).getId() + " y " + player.get(1).getId());
                player.remove(zero);
                auxiliar = false;
            }

        }while((player.size()!=1));

        String res = "";

        if(auxiliar) {
          res = "El ganador es el jugador " + player.get(0).getId();
        }else {
            res = "Pues a falta de más, gana el jugador restante " +player.get(0).getId();
        }

        return
                res;

    }

}