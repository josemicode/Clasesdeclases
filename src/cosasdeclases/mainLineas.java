package cosasdeclases;

import java.util.Scanner;

public class mainLineas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Lineas l1 = new Lineas (1.0,2.0);

        System.out.println("seleccione un número de unidades");
        Double uds = sc.nextDouble();

        System.out.println("Elije una dirección: I, D, Ar, Ab");
        String eleccion = sc.next();

        switch (eleccion) {
            case "I":
                l1.despIzq(uds);
                System.out.println(l1.toString());
                break;
            case "D":
                l1.despDer(uds);
                System.out.println(l1.toString());
                break;
            case "Ar":
                l1.despArrib(uds);
                System.out.println(l1.toString());
                break;
            case "Ab":
                l1.despAbaj(uds);
                System.out.println(l1.toString());
                break;
        }
    }
}
