package cosasdeclases;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class maindado {

    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);

        Dado dado1 = new Dado();
        System.out.println("Introduzca un num de caras");
        dado1.setNcaras(sc.nextInt());
        System.out.println(dado1.getNcaras());
        dado1.tirar();
        System.out.println(dado1.getValor());
    }

}
