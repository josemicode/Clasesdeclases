package herencias.abstractas;

public abstract class FiguraGeometrica {

    private double area;
    private double perimetro;

    public FiguraGeometrica(double area, double perimetro) {
        this.area = area;
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public abstract double calcularArea();

    public abstract double calcularPerimetro();

    public String compararArea(FiguraGeometrica f) {
        String res = "";

        if(this.calcularArea()>f.calcularArea()) {
            res = "El primero es mayor";
        }else if(this.calcularArea()<f.calcularArea()) {
            res = "El segundo es mayor";
        }
        return
                res;
    }
}
