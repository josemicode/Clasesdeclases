package herencias.elmainsito;

import herencias.clases.Disco;
import herencias.clases.Libro;
import herencias.clases.Revista;

public class mainInterfaces {
    public static void main(String[] args) {

        /*

        Libro libro = new Libro("", "", "", "", false);

        libro.prestar();
        libro.retirar();

        System.out.println(String.valueOf(libro.isPrestado()));
        System.out.println(String.valueOf(libro.isBeingConsultada()));

        Revista revista = new Revista("","","","", true);

        revista.reinsertar();
        revista.retirar();

        System.out.println(String.valueOf(revista.isBeingConsultada()));       */

        Disco disco = new Disco("","","","",true, false);

        disco.devolver();
        disco.retirar();

        System.out.println(String.valueOf(disco.isBeingConsultada()));
        System.out.println(String.valueOf(disco.isPrestado()));
    }
}
