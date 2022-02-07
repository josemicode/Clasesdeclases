package herencias.matriculados;

import java.util.ArrayList;
import java.util.List;

public class Profesor extends Persona{

    private double sueldo;
    List<Asignatura> asignaturaList = new ArrayList<Asignatura>();

    public Profesor() {
        super();
        this.sueldo = 0;
        this.asignaturaList = new ArrayList<Asignatura>();
    }

    public Profesor(String nombre, int chi, double sueldo) {
        super(nombre, chi);
        this.sueldo = sueldo;
        this.asignaturaList = new ArrayList<Asignatura>();
    }

    public Profesor(double sueldo, List<Asignatura> asignaturaList) {
        super();
        this.sueldo = sueldo;
        this.asignaturaList = asignaturaList;
    }

    @Override
    public String toString() {
        return super.toString() + ", sueldo = " + sueldo;
    }
}
