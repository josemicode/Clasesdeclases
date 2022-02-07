package herencias.matriculados;

import java.util.ArrayList;
import java.util.List;

public class Asignatura {

    private String nombre;
    private List<Estudiante> listado;
    private Profesor profe;

    public Asignatura() {
        this.nombre = "";
        this.profe = new Profesor();
        this.listado = new ArrayList<Estudiante>();
    }

    public Asignatura(String nombre) {
        this.nombre = nombre;
        this.profe = new Profesor();
        this.listado = new ArrayList<Estudiante>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Estudiante> getListado() {
        return listado;
    }

    public void setListado(List<Estudiante> listado) {
        this.listado = listado;
    }

    public Profesor getProfe() {
        return profe;
    }

    public void setProfe(Profesor profe) {
        this.profe = profe;
    }

    public boolean matricula(Estudiante alumno) {

        boolean res = false;

        if(!this.listado.contains(alumno)){
            this.listado.add(alumno);
            alumno.getAsignaturaList().add(this);
            res = true;
        }

        return
                res;
    }

    public boolean baja(Estudiante alumno) {


        boolean res = false;

        if(this.listado.contains(alumno)){
            this.listado.remove(alumno);
            alumno.getAsignaturaList().remove(alumno);
            res = true;
        }

        return
                res;
    }

    public String listaAlumnos() {

        String res = "";

        for(int i = 0; i < listado.size(); i++) {
            res += listado.get(i);
        }

        return
                res;
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "nombre='" + nombre +
                '}';
    }
}
