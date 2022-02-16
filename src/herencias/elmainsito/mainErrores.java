package herencias.elmainsito;

import java.util.Random;
import java.util.Scanner;

public class mainErrores {

    public static int edad;

    public static void setEdad(int num) throws Exception{
        if (num>0)
            edad=num;
        else
            throw new Exception("Número negativo");
    }

    public static double temperatura;

    public static void compTemperatura(double temp) throws Exception {
        if (temp<=100 && temp>=0)
           temperatura = temp;
        else
            throw new Exception("Temperatura excede los límites del termómetro");
    }

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
/*                                                  Tarea1
        boolean cond = false;

        do {

            System.out.println("Introduzca un double");

            try {

                Double formato = sc.nextDouble();
                cond = false;

            } catch (Exception ime) {
                System.out.println("Mal hecho");
                cond = true;
                sc.nextLine();

            }

        }while (cond);

        System.out.println("Buena");

                                                 Tarea 2*//*

        Random rd = new Random();

        int randomnum = rd.nextInt(12);
        System.out.println(randomnum);

        try {

            if(randomnum%2!=0){

                throw new Exception("Es impar");
            }else{
                throw new Exception("Es par");
            }

        }catch (Exception ex) {
            System.out.println(ex.toString());
        }
*//*                                              Tarea 3
        System.out.println("introduzca su edad");
        try {
            setEdad(sc.nextInt());
        }catch (Exception ex){
            System.out.println(ex.toString());
        }

        System.out.println("vamoos");
*/
        System.out.println("introduzca cualquier temperatura");

        try{
            compTemperatura(sc.nextDouble());
        }catch (Exception ex){
            System.out.println(ex.toString());
        }

    }
}
