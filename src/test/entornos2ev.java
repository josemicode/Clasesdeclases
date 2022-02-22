package test;

import java.util.Scanner;

public class entornos2ev {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int counter = 0;

        System.out.println("\n a. \n b. \n c. \n d. \n");
        if (sc.next().charAt(0)=='a'){
            System.out.println("(^^)\n");
            counter++;
        }else
            System.out.println("X\n");


        System.out.println("Has acertado " +counter+ " preguntas de 18");
    }
}
