package cosasdeclases;

import java.util.Scanner;

public class mainFecha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Fecha date = new Fecha(1,1,1);

        System.out.println("Introduzca el día");
        date.setDia(sc.nextInt());
        System.out.println("Introduzca el mes");
        date.setMes(sc.nextInt());
        System.out.println("Introduzca el año");
        date.setAno(sc.nextInt());

        String condicion = "no";

        do {
            System.out.println("¿Desea avanzar o retroceder un día?");
            String decision = sc.next();

            switch (decision) {
                case "avanzar":
                    date.add();
                    break;

                case "retroceder":
                    date.sub();
                    break;
            }
            System.out.println(date.toString());
            System.out.println("¿Desea seguir modificando la fecha?");
            condicion = sc.next();
        }while(condicion.equals("si"));
    }
}
