package herencias.abstractas;

import herencias.clases.Casilla;

public abstract class _Figura {

    private String color;
    private boolean vida;
    private Casilla cas;

    public _Figura(String color) {
        this.color = color;
        this.vida = true;
    }

    public Casilla getCas() {
        return cas;
    }

    public void setCas(Casilla cas) {
        this.cas = cas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isVida() {
        return vida;
    }

    public void setVida(boolean vida) {
        this.vida = vida;
    }

    public void morir() {
        this.vida = false;
    }

    public abstract void movimiento(Casilla casilla2);
}
