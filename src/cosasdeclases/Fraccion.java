package cosasdeclases;

public class Fraccion {

    private int numerador;
    private int denominador;

    public Fraccion() {

    }
    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public Fraccion sum(Fraccion f2) {
        Fraccion f3 = new Fraccion();
        f3.numerador = ((this.numerador * f2.denominador) + (this.denominador * f2.numerador));
        f3.denominador = (this.denominador * f2.denominador);
        return f3;
    }

    public Fraccion rest(Fraccion f2) {
        Fraccion f3 = new Fraccion();
        f3.numerador = ((this.numerador * f2.denominador) - (this.denominador * f2.numerador));
        f3.denominador = (this.denominador * f2.denominador);
        return f3;
    }

    public Fraccion mult(Fraccion f2) {
        Fraccion f3 = new Fraccion();
        f3.numerador = (this.numerador * f2.numerador);
        f3.denominador = (this.denominador * f2.denominador);
        return f3;
    }

    public Fraccion div(Fraccion f2) {
        Fraccion f3 = new Fraccion();
        f3.numerador = (this.numerador * f2.denominador);
        f3.denominador = (this.denominador * f2.numerador);
        return f3;
    }

    @Override
    public String toString() {
        return "La frección resultante es: " + this.numerador + "/" + this.denominador;
    }
}