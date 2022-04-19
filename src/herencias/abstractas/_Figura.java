package herencias.abstractas;

import herencias.clases.Casilla;
import herencias.clases.Tablero;

import javax.swing.*;

public abstract class _Figura {

    protected String color;
    protected boolean movida;
    protected Casilla cas;
    protected ImageIcon img;

    public _Figura(String color) {
        this.color = color;
        this.movida = false;
    }

    public ImageIcon getImg() {
        return img;
    }

    public void setImg(ImageIcon img) {
        this.img = img;
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

    public boolean isMovida() {
        return movida;
    }

    public void setMovida(boolean movida) {
        this.movida = movida;
    }

    /*public void morir() {
        this.movida = false;
    }*/

    public abstract void movimiento(Casilla casilla2, Tablero tablas);
}
