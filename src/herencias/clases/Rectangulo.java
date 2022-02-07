package herencias.clases;

import herencias.abstractas.FiguraGeometrica;

public class Rectangulo extends FiguraGeometrica {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        super(0.0, 0.0);

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

    @Override
    public double calcularArea() {
        setArea(base * altura);

        double area = base * altura;
        return area;
    }

    @Override
    public double calcularPerimetro() {

        double perim = 2*base + 2*altura;
        return
                perim;
    }
}
