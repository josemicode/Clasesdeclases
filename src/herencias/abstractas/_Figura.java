package herencias.abstractas;

import herencias.clases.Casilla;
import herencias.clases.Tablero;

import javax.swing.*;

public abstract class _Figura {

    private String color;
    private boolean vida;
    private Casilla cas;
    private ImageIcon img;
    private int Pos;

    public _Figura(String color) {
        this.color = color;
        this.vida = true;
    }

    public int getPos() {
        return Pos;
    }

    public void setPos(int pos) {
        Pos = pos;
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

    public abstract void movimiento(Casilla casilla2, Tablero tablas);
}
