package herencias.cositas4;

public class Galisteo extends Profesor {

                                            //Constructor con valores predeterminados

    public Galisteo() {
        this.nombre = "Diosito";
        this.edad = 99999;
        this.asignatura = "Entornos y Filosofía de vida";
    }
                                            //Métodos heredados y overrideados
    @Override
    public String fraseCaracterística() {
        return "Yiiiuuujuuuu";
    }

    @Override
    public String horaDeLlegada() {
        return "Literalmente impredecible, escapa toda lógica; es el puro concepto de la entropía";
    }

    @Override
    public boolean descansito(int churros) {
        boolean res = false;

        if(churros!=0) {
            res = true;
        }

        return res;
    }
}
