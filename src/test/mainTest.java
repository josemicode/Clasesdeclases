package test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class mainTest {
    public static void main(String[] args) throws IOException {

        LectTest testEntornos = new LectTest("ent3ev.txt");
        LectTest testSistemas = new LectTest("sist3ev.txt");
        LectTest testMarcas = new LectTest("llmm3ev.txt");
        LectTest testBases = new LectTest("bbdd3ev.txt");
        LectTest testProgramacion = new LectTest("prog3ev.txt");
        //testEntornos.Impresion();

        Scanner newchar = new Scanner(System.in);

        System.out.println("E, S, M, B, P");
        char decis = newchar.next().toLowerCase().charAt(0);

        switch (decis) {
            case 'e':
                testEntornos.Impresion();
                break;
            case 's':
                testSistemas.Impresion();
                break;
            case 'm':
                testMarcas.Impresion();
                break;
            case 'b':
                testBases.Impresion();
                break;
            case 'p':
                testProgramacion.Impresion();
                break;
        }
    }
}
