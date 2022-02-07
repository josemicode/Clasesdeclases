package herencias.clases;

import herencias.abstractas.FiguraGeometrica;

public class Triangulo extends FiguraGeometrica {

    private double base;
    private double altura;
    private double lado1;
    private double lado2;

    public Triangulo(double base, double altura, double lado1,double lado2) {
        super(0.0, 0.0);

        this.lado1 = lado1;
        this.lado2 = lado2;
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    @Override
    public double calcularArea() {
        double area = base*altura/2;
        return area;
    }

    @Override
    public double calcularPerimetro() {

        double perim = base+lado1+lado2;
        return
                perim;
    }
}
