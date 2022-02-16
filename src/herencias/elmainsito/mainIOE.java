package herencias.elmainsito;

import herencias.clases.Desbordamiento;

import java.util.Scanner;

public class mainIOE {

    public static int num = 10;
    public static int den = 0;
    public static double res;

    public static void main(String[] args) {

        Desbordamiento borde = new Desbordamiento();

        Scanner sc = new Scanner(System.in);
/*
        System.out.println("Antes");

        try {

            res = (double) (num / den);


        } catch (ArithmeticException ae) {
            System.out.println("No dividas por ceroooo (o si no te aparecerá " + ae +")");

            res = (double) (num/1);
        }

        System.out.println("Después");
        System.out.println(res);

        System.out.println("Elija la cantidad de elementos que quiere imprimir:");
        int leg = sc.nextInt();

        try {

            System.out.println(borde.mostrarArr(leg));

        } catch (ArrayIndexOutOfBoundsException ai) {

            System.out.println("\nSe ha liado algo en el Array");

        }
*/

        int nota;

        try{
            System.out.println("introduzca la nota");

            nota = sc.nextInt();
            if (nota < 5)
            {
                throw new Exception("Enrique te raspa");
            }
        }catch (Exception er){
            System.out.println(er);
        }
    }
}
