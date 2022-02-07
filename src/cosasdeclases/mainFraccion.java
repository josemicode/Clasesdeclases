package cosasdeclases;

import java.util.Scanner;

public class mainFraccion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Fraccion f1 = new Fraccion(1, 1);
        Fraccion f2 = new Fraccion(2, 2);
        Fraccion f3 = new Fraccion();
        System.out.println("Introduzca el numerador de la primera fracción");
        f1.setNumerador(sc.nextInt());
        System.out.println("Introduzca el denominador de la primera fracción");
        f1.setDenominador(sc.nextInt());
        System.out.println("Introduzca el numerador de la segunda fracción");
        f2.setNumerador(sc.nextInt());
        System.out.println("Introduzca el denominador de la segunda fracción");
        f2.setDenominador(sc.nextInt());

        System.out.println("Elija una operación: suma, resta, multiplicacion o division");
        String eleccion = sc.next();

        switch (eleccion) {
            case "suma":
                f3=f1.sum(f2);
                System.out.println(f3.toString());
                break;

            case "resta":
                f3=f1.rest(f2);
                System.out.println(f3.toString());
                break;

            case "multiplicacion":
                f3=f1.mult(f2);
                System.out.println(f3.toString());
                break;

            case "division":
                f3=f1.div(f2);
                System.out.println(f3.toString());
                break;
        }
    }
}
