package cosasdeclases;

public class Puntos {
    private double x;
    private double y;

    public Puntos() {
        this.x = 0;
        this.y = 0;
    }

    public Puntos(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void dx(double aux) {

        this.x = this.x + aux;
    }

    public void dy(double aux) {

        this.y = this.y + aux;
    }

    public void dxy(double aux) {
        this.x = this.x + aux;
        this.y = this.y + aux;
    }

    public void dxyplus(double d1, double d2) {
        this.x = this.x + d1;
        this.y = this.y + d2;
    }

    @Override
    public String toString() {
        return "Puntos{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
