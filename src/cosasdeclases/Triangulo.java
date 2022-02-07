package cosasdeclases;

public class Triangulo {

    private int lado1;
    private int lado2;
    private int lado3;

    private Double area;
    private int perimetro;

    private boolean is_equilatero;
    private boolean is_isosceles;
    private boolean is_escaleno;

    public Triangulo(int lado1, int lado2, int lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getLado3() {
        return lado3;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }
                                    //PERÍMETRO
    public int calc_perimetro() {
        this.perimetro = lado1+lado2+lado3;
        return this.perimetro;
    }
                                    //ÁREA
    public Double calc_area() {
        this.calc_perimetro();
        this.area = (Double) Math.sqrt((perimetro/2)*(perimetro/2-lado1)*(perimetro/2-lado2)*(perimetro/2-lado3));
        return this.area;
    }

    public boolean comp_is_equilatero(){
        if((lado1==lado2)&&(lado2==lado3)){
            is_equilatero = true;
        }
        return is_equilatero;
    }

    public boolean comp_is_isosceles(){
        if(((lado1==lado2)&&(lado2!=lado3))||((lado2==lado3)&&(lado3!=lado1))){
            is_isosceles = true;
        }
        return is_isosceles;
    }

    public boolean comp_is_escaleno(){
        if((lado1!=lado2)&&(lado2!=lado3)&&(lado3!=lado1)){
            is_escaleno = true;
        }
        return is_escaleno;
    }
}
