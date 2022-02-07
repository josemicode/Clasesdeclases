package herencias.tfisolofitos;

public class Alonso extends Animales{

    private int nhijos;

    public Alonso(String reino, String familia, int nhijos) {
        super(reino, familia);
        this.nhijos = nhijos;
    }

    public int getNhijos() {
        return nhijos;
    }

    public void setNhijos(int nhijos) {
        this.nhijos = nhijos;
    }

    @Override
    public void emitirsonido() {
        System.out.println("Por el culo te la hinco");
    }

}
