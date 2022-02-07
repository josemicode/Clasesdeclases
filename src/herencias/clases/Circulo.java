package herencias.clases;

import herencias.abstractas.FiguraGeometrica;

public class Circulo extends FiguraGeometrica {

    private double circunferencia;
    private double radio;
    final double pi = 3.14;

    public Circulo(double circunferencia, double radio) {
        super(0.0, 0.0);

        this.circunferencia = circunferencia;
        this.radio = radio;
    }

    public double getCircunferencia() {
        return circunferencia;
    }

    public void setCircunferencia(double circunferencia) {
        this.circunferencia = circunferencia;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {

        double area = radio*radio*pi;
        return area;
    }

    @Override
    public double calcularPerimetro() {

        double perim = 2*pi*radio;
        return
                perim;
    }
}
