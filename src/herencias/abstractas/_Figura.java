package herencias.abstractas;

import herencias.clases.Casilla;

import javax.swing.*;

public abstract class _Figura {

    private String color;
    private boolean vida;
    private Casilla cas;
    private ImageIcon img;

    public _Figura(String color) {
        this.color = color;
        this.vida = true;
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
