package cosasdeclases.blackjack;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mainBJ {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        Jugador j1 = new Jugador(1);
        Jugador j2 = new Jugador(2);
        Jugador j3 = new Jugador(3);

        List<Jugador>PlayerList = new ArrayList<Jugador>();

        PlayerList.add(0, j1);
        PlayerList.add(1, j2);
        PlayerList.add(2, j3);

        Partida match = new Partida(1);
        match.setPlayer(PlayerList);

        int size = PlayerList.size();
        String size2 = String.valueOf(size);
        System.out.println(size2);

        int plantitas = 0;


        while(plantitas<3) {
            for (int i = 0; i < PlayerList.size(); i++) {
                System.out.println("Bienvenido, jugador " + match.getPlayer().get(i).getId());

                int peticion = 0;
                do {
                    System.out.println("pedir o plantarse");
                    String say = sc.next();

                    switch (say) {
                        case "pedir":
                            match.getPlayer().get(i).pedir();
                            System.out.println(match.getPlayer().get(i).getMano().get(peticion).toString());
                            peticion++;
                            break;

                        case "plantarse":
                            System.out.println(match.getPlayer().get(i).plantarse());
                            //System.out.println(match.getPlayer().get(i).getValormano());
                            plantitas++;
                            break;
                    }

                } while (!match.getPlayer().get(i).isPlanta());
            }
        }

        System.out.println(match.minitorneo(0,1));

    }
}

