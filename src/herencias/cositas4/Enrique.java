package herencias.cositas4;

public class Enrique extends Profesor{

                                        //Constructor con valores predeterminados

    public Enrique() {
        this.nombre = "Le Biché";
        this.edad = 26;
        this.asignatura = "Programación";
    }
                                        //Métodos heredados y overrideados
    @Override
    public String fraseCaracterística() {
        return "shuby doo, oh dímelo a mí";
    }

    @Override
    public String horaDeLlegada() {
        return "32 segundos tarde";
    }

    @Override
    public boolean descansito(int numerodealumnosllorando) {
        boolean res = false;

        if (numerodealumnosllorando>5){
            res = true;
        }

        return res;
    }
}
