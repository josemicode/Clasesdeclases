package herencias.matriculados;

import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Persona{

    List<Asignatura> asignaturaList = new ArrayList<Asignatura>();
    private double notaMedia;

    public Estudiante(double notaMedia) {
        super();
        this.notaMedia = notaMedia;
    }

    public Estudiante(double notaMedia, String nombre, int chi) {
        super(nombre, chi);
        this.notaMedia = notaMedia;
    }

    public List<Asignatura> getAsignaturaList() {
        return asignaturaList;
    }

    public void setAsignaturaList(List<Asignatura> asignaturaList) {
        this.asignaturaList = asignaturaList;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    public void listarAsignaturas() {
        for(int i = 0; i < asignaturaList.size(); i++) {
            System.out.println(asignaturaList.get(i));
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", mi nota media es " + notaMedia;
    }
}
