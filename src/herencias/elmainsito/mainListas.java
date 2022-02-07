package herencias.elmainsito;

import herencias.clases.Cola;
import herencias.clases.Pila;

import java.util.Scanner;

public class mainListas {
    public static void main(String[] args) {

        Pila colilla = new Pila();

        Scanner sc = new Scanner(System.in);

        colilla.push(1);
        colilla.push(2);
        colilla.push(3);
        colilla.push(4);
        colilla.push(5);
        colilla.push(6);

        colilla.push(7);

        colilla.pop();
        colilla.pop();

        colilla.push(8);
        colilla.push(9);
        colilla.push(10);
        colilla.pop();
        colilla.push(11);

        System.out.println(colilla);
    }
}
