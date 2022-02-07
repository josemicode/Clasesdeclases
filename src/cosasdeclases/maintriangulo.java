package cosasdeclases;

import java.util.Scanner;

public class maintriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Triangulo casicuadrado = new Triangulo(1, 2, 3);

        System.out.println("Defina el lado 1");
        casicuadrado.setLado1(sc.nextInt());

        System.out.println("Defina el lado 2");
        casicuadrado.setLado2(sc.nextInt());

        System.out.println("Defina el lado 3");
        casicuadrado.setLado3(sc.nextInt());

        System.out.println(casicuadrado.calc_perimetro());
        casicuadrado.calc_perimetro();

        System.out.println(casicuadrado.calc_area());
        casicuadrado.calc_area();

        if(casicuadrado.calc_area()==0){
            System.out.println("Pero mamón, introduce un triángulo real");
        }

        if(casicuadrado.comp_is_equilatero()){
            System.out.println("Es equilátero");
        }if(casicuadrado.comp_is_isosceles()){
            System.out.println("Es isósceles");
        }if(casicuadrado.comp_is_escaleno()){
            System.out.println("Es escaleno");
        }
    }
}
