package herencias.tfisolofitos;

public abstract class Animales {
    private String reino;
    private String familia;

    public Animales(String reino, String familia) {

        this.reino = reino;
        this.familia = familia;
    }

    public String getReino() {
        return reino;
    }

    public void setReino(String reino) {
        this.reino = reino;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

                                //methods

    public abstract void emitirsonido();

    public void morirse() {
        System.out.println("me he muerto :( ");
    }
}
