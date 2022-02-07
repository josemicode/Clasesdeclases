package herencias.abstractas;

public abstract class _Figura {

    private String color;
    private boolean vida;

    public _Figura(String color) {
        this.color = color;
        this.vida = true;
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

    public abstract void movimiento();

    public void morir() {
        this.vida = false;
    }

    
}
