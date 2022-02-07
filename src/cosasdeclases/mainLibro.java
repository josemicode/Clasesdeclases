package cosasdeclases;

import java.util.Scanner;

public class mainLibro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Libro libro1 = new Libro("0","0","0",0,"0","0","0",false);

        System.out.println("Introduzca:");

        System.out.println("ISBN");
        libro1.setISBN(sc.nextLine());
        System.out.println("Titulo");
        libro1.setTitle(sc.nextLine());
        System.out.println("Autor");
        libro1.setAuthor(sc.nextLine());
        System.out.println("Número de páginas");
        libro1.setNumpag(sc.nextInt());
        System.out.println("Género literario");
        libro1.setGenre(sc.nextLine());
        System.out.println("Fecha de salida");
        libro1.setReldate(sc.nextLine());
        System.out.println("Editorial");
        libro1.setEditorial(sc.nextLine());

        System.out.println("¿Quieres realizar un préstamo (llevártelo)?");
        String decision = sc.next();

        if(decision.equals("si") && !libro1.isPrestado()) {
            System.out.println("Te lo puedes llevar");
            libro1.prestamo();
        }

        if(decision.equals("no") || libro1.isPrestado()) {
            System.out.println("NO te lo llevas");
        }

        Libro libro2 = new Libro("0","0","0",0,"0","0","0",false);

        System.out.println("Introduzca:");

        System.out.println("ISBN");
        libro2.setISBN(sc.nextLine());
        System.out.println("Titulo");
        libro2.setTitle(sc.nextLine());
        System.out.println("Autor");
        libro2.setAuthor(sc.nextLine());
        System.out.println("Número de páginas");
        libro2.setNumpag(sc.nextInt());
        System.out.println("Género literario");
        libro2.setGenre(sc.nextLine());
        System.out.println("Fecha de salida");
        libro2.setReldate(sc.nextLine());
        System.out.println("Editorial");
        libro2.setEditorial(sc.nextLine());

        System.out.println("¿Quieres realizar un préstamo (llevártelo)?");
        String decision2 = sc.next();

        if(decision2.equals("si") && libro2.isPrestado()) {
            System.out.println("Te lo puedes llevar");
            libro1.prestamo();
        }

        if(decision2.equals("no") || !libro2.isPrestado()) {
            System.out.println("NO te lo llevas");
        }

        libro1.comparar(libro2);

    }
}
