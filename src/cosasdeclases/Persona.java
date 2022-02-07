package cosasdeclases;

public class Persona {

    private String nombre;
    private String apellidos;
    private String dni;
    private int edad;

    private int nbrazos=2;
    private int npiernas=2;

    public Persona(String nombre, String apellidos, String dni, int edad) {

        this.nombre=nombre;
        this.apellidos=apellidos;
        this.dni=dni;
        this.edad=edad;

    }

    public Persona(String nombre, String apellidos, String dni, int edad, int npiernas, int nbrazos) {

        this.nombre=nombre;
        this.apellidos=apellidos;
        this.dni=dni;
        this.edad=edad;

    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public String getDni() {
        return this.dni;
    }

    public int getEdad() {
        return this.edad;
    }


    public void setNombre(String nombre) {
        this.nombre=nombre;
    }
    public void setApellidos(String apellidos) {
        this.apellidos=apellidos;
    }
    public void setDni(String dni) {
        this.dni=dni;
    }
    public void setEdad(int edad) {
        this.edad=edad;
    }


}
