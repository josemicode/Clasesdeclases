package herencias.matriculados;

import herencias.interfaces.iCantante;

public class Persona implements iCantante {

    protected String nombre;
    protected int chi;

    public Persona(String nombre, int chi) {
        this.nombre = nombre;
        this.chi = chi;
    }

    public Persona() {
        this.nombre = "";
        this.chi = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getChi() {
        return chi;
    }

    public void setChi(int chi) {
        this.chi = chi;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", chi=" + chi +
                '}';
    }

    @Override
    public void cantar() {
        System.out.println("aaaaaaaaaaaaaa");
    }
}
