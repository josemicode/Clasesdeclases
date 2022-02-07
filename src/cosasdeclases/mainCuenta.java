package cosasdeclases;

import java.util.Scanner;

public class mainCuenta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cuenta cuenta1 = new Cuenta("Mauricio");
        cuenta1.setSaldo(10000);
        Cuenta cuenta2 = new Cuenta("Francisco");

        System.out.println("Buenas tardes, Mauricio");

        boolean cond = true;

        do{
            System.out.println("¿Desea ingresar, retirar o realizar una transferencia?");

            System.out.println(cuenta1.toString());

            String operacion = sc.next();


            switch(operacion){
                case "ingresar":

                    System.out.println("Elija una cantidad");
                    cuenta1.setLiquido(sc.nextInt());

                    cuenta1.ingresar(cuenta1.getSaldo());

                    break;

                case "retirar":
                    System.out.println("Elija una cantidad");
                    cuenta1.setLiquido(sc.nextInt());

                    cuenta1.retirar(cuenta1.getSaldo());
                    break;

                case "transferencia":

                    System.out.println("Elija una cantidad");
                    cuenta1.setLiquido(sc.nextInt());

                    cuenta1.transferencia(cuenta1.getSaldo(), cuenta2);
            }
        }while(true);
    }
}
