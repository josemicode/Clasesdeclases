package cosasdeclases;

import java.util.Scanner;

public class mainPuntos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Puntos x1 = new Puntos(0,0);

        System.out.println("X, Y, XY, DXDY");
        String eleccion = sc.next();

        switch (eleccion) {
            case "X":
                System.out.println("Seleccione unidad:");
                Double equis = sc.nextDouble();
                x1.dx(equis);
                System.out.println(x1.toString());
                break;
            case "Y":
                System.out.println("Seleccione unidad:");
                Double ygriega = sc.nextDouble();
                x1.dy(ygriega);
                System.out.println(x1.toString());
                break;
            case "XY":
                System.out.println("Seleccione unidad:");
                Double doblete = sc.nextDouble();
                x1.dx(doblete);
                x1.dy(doblete);
                System.out.println(x1.toString());
                break;
            case "DXDY":
                System.out.println("Seleccione unidad para añadir a x:");
                equis = sc.nextDouble();
                System.out.println("Seleccione unidad para añadir a y");
                ygriega = sc.nextDouble();
                x1.dx(equis);
                x1.dy(ygriega);
                System.out.println(x1.toString());
                break;
        }
    }
}
