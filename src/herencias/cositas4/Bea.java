package herencias.cositas4;

public class Bea extends Profesor{
                                        //Constructor con valores predeterminados
    public Bea() {
        this.nombre = "Sara";
        this.edad = 26;
        this.asignatura = "LLMM y Sistemas";
    }
                                        //Métodos heredados y overrideados
    @Override
    public String fraseCaracterística() {
        return "Niiiiños";
    }

    @Override
    public String horaDeLlegada() {
        return "Very puntual";
    }

    @Override
    public boolean descansito(int hora) {
        boolean res = false;

        if (hora == 10)
            res = true;

        return res;
    }
}
