package cosasdeclases;

public class Dado {

    private int ncaras = 6;
    private int valor;

    public Dado() {
        this.valor =(int) (Math.random()*this.ncaras) +1;
    }

    public int getNcaras() {
        return this.ncaras;
    }

    public int getValor() {
        return this.valor;
    }

    public void setNcaras(int ncaras) {
        this.ncaras=ncaras;
    }

    public void tirar() {
        this.valor =(int) (Math.random()*this.ncaras) +1;
    }

}
