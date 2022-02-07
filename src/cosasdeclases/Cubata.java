package cosasdeclases;

public class Cubata {

    private int max = 1000;
    private int contenido;
    private String sabor;


    public Cubata(String sabor, int contenido){
        this.sabor=sabor;
        this.contenido=contenido;

    }
    public String getSabor() {
        return this.sabor;
    }
    public void setSabor(String sabor) {this.sabor = sabor;}

    public int getContenido() {
        return this.contenido;
    }
    public void setContenido(int contenido){this.contenido=contenido;}




    public void llenar() {
        this.contenido = max;
    }

    public void beber(int trago) {
        this.contenido = (int) (this.contenido-trago);
    }

    public void hidalgo() {
        this.contenido = 0;
    }

    public String toString() {
        return
                "Tu cubata de "+ getSabor() + " tiene " + getContenido() + "ml de contenido, ¿Quiere continuar?";
    }
}
