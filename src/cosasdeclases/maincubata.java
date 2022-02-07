package cosasdeclases;

import java.util.Scanner;

public class maincubata {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cubata vaso = new Cubata("naranja", 500);

        System.out.println("¿De qué sabor quiere usted su cubata?");
        vaso.setSabor(sc.next());

        System.out.println("¿Como de lleno?");
        vaso.setContenido(sc.nextInt());

        boolean continuar = true;

        while (continuar==true) {

            System.out.println("¿Quieres dar un trago, llenar tu vaso o hacer un hidalgo?");
            String decision = sc.next();

            switch (decision) {
                case "trago":
                    System.out.println("¿Cuánto quieres beber?");
                    vaso.beber(sc.nextInt());
                    break;

                case "llenar":
                    vaso.llenar();
                    System.out.println("Hasta arriba");
                    break;

                case "hidalgo":
                    vaso.hidalgo();
                    System.out.println("xd");
                    break;

                default:
                    System.out.println("Si no sabes ni hablar no estás como para seguir bebiendo");
                    continuar = false;
                    break;
            }
            if(continuar==true) {
                System.out.println(vaso.toString());
                String seguir = sc.next();

                if (!seguir.equals("si")) {
                    continuar = false;
                }
            }
        }


    }
}
