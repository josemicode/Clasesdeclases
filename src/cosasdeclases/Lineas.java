package cosasdeclases;

public class Lineas {
    private Puntos p1;
    private Puntos p2;

    public Lineas() {
        this.p1 = new Puntos();
        this.p2 = new Puntos();
    }

    public Lineas(Puntos p1, Puntos p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Lineas (double x1, double y1, double x2, double y2) {
        this.p1 = new Puntos(x1, y1);
        this.p2 = new Puntos(x2, y2);
    }

    public Lineas (double x, double y) {
        this.p1 = new Puntos();
        this.p2 = new Puntos(x, y);
    }

    @Override
    public String toString() {
        String res = "("+p1+","+p2+")";
        return res;
    }

    //methods

    public void despArrib(double aux) {
        this.p1.setY(p1.getY()+aux);
        this.p2.setY(p2.getY()+aux);
    }

    public void despAbaj(double aux) {
        this.p1.setY(p1.getY()-aux);
        this.p2.setY(p2.getY()-aux);
    }

    public void despIzq(double aux) {
        this.p1.setX(p1.getX()-aux);
        this.p2.setX(p2.getX()-aux);
    }

    public void despDer(double aux) {
        this.p1.setX(p1.getX()+aux);
        this.p2.setX(p2.getX()+aux);
    }
}

