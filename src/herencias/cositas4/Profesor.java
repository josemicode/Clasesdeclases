package herencias.cositas4;

public abstract class Profesor {
                                    //Atributos protegidos
    protected String nombre;
    protected int edad;
    protected String asignatura;
                                    //Getters y Setters de estos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
                                                    //Métodos abstractos
    public abstract String fraseCaracterística();

    public abstract String horaDeLlegada();

    public abstract boolean descansito(int modificador);

}
