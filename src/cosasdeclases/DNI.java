package cosasdeclases;

public class DNI {

    private int dni;
    private String apellidos;
    private String nombre;


    public DNI(int dni, String apellidos, String nombre) {
        this.dni = dni;
        this.apellidos = apellidos;
        this.nombre = nombre;
    }

    public DNI() {

    }

    public DNI(DNI dni, String apellidos, String nombre) {
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void dniCalc() {
        int dninumbers = this.dni%23;
        String secuencia = "TRWAGMYFPDXBNJZSQVHLCKE";
        char letra = secuencia.charAt(this.dni);
        String todoi = String.valueOf(this.dni + letra);
    }
}
