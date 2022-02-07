package herencias.optimus;

public class Vehiculo {

    protected int nruedas;
    protected int npuertas;
    protected int nasientos;

    public Vehiculo() {
        this.nruedas=0;
        this.npuertas=0;
        this.nasientos=0;
    }

    public Vehiculo(int nruedas, int npuertas, int nasientos) {
        this.nruedas = nruedas;
        this.npuertas = npuertas;
        this.nasientos = nasientos;
    }

    public void pitar() {
        System.out.println("Optimus Prime");
    }

}
