package herencias.matriculados;

import java.util.ArrayList;

public class wewewe {
    public static void main(String[] args) {

        Estudiante alvaro = new Estudiante(7, "Alvaro", 12);
        Asignatura asig = new Asignatura("churros");
        Asignatura asig2 = new Asignatura("polingano");
        ArrayList<Asignatura> asignaturas = new ArrayList<Asignatura>();
        asignaturas.add(asig);
        asignaturas.add(asig2);
        Profesor galis = new Profesor(3000, asignaturas);
        galis.setNombre("Galisteo(diosito)");
        galis.setChi(9000);
        asig.setProfe(galis);
        asig2.setProfe(galis);

        asig.matricula(alvaro);
        asig.baja(alvaro);

        System.out.println(asig.listaAlumnos());
    }
}
