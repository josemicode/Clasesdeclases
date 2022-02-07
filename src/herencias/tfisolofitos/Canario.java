package herencias.tfisolofitos;

import herencias.interfaces.iCantante;

public class Canario extends Animales implements iCantante {

    public Canario(String reino, String familia) {
        super(reino, familia);
    }

    @Override
    public void emitirsonido() {
        System.out.println("pip pip");
    }

    @Override
    public void cantar() {
        System.out.println("Ojalá mis sueños se hicieran realidad");
    }
}
