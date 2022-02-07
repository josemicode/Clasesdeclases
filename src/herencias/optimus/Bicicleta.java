package herencias.optimus;

public class Bicicleta extends Vehiculo {

    private int nfrenos;
    private int nsillin;
    private int nmanillares;

    public Bicicleta() {
        super();
        this.nfrenos=0;
        this.nsillin=0;
        this.nmanillares=0;
    }

    public Bicicleta(int nfrenos, int nsillin, int nmanillares, int nruedas, int npuertas, int nasientos) {

        super(nruedas, npuertas, nasientos);

        this.nfrenos = nfrenos;
        this.nsillin = nsillin;
        this.nmanillares = nmanillares;
    }

    @Override
    public void pitar() {
        System.out.println("*Biciruidos*");
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "nfrenos=" + nfrenos +
                ", nsillin=" + nsillin +
                ", nmanillares=" + nmanillares + ", npuertas=" +
                npuertas+'}';
    }
}
