package herencias.cositas4;

public class mainTeachers {
    public static void main(String[] args) {

        Bea gypsy = new Bea();
        Enrique baloo = new Enrique();
        Galisteo galistei = new Galisteo();

        System.out.println("Yo soy " + gypsy.getNombre() + ", tengo " +gypsy.edad+ " años, y mis asignaturas son " + gypsy.getAsignatura());
        System.out.println(gypsy.fraseCaracterística());
        System.out.println("Mi hora de llegada es " +gypsy.horaDeLlegada());

        System.out.println("Preguntando a las 10... ");

        if (gypsy.descansito(10)){
            System.out.println("10 minutitos justos");
        }else{
            System.out.println("no os quejeis");
        }

        System.out.println("Yo soy " + baloo.getNombre() + ", tengo " +baloo.edad+ " años, y mi asignatura es " + baloo.getAsignatura());
        System.out.println(baloo.fraseCaracterística());
        System.out.println("Mi hora de llegada es " +baloo.horaDeLlegada());

        System.out.println("Hay solo 3 personas quejándose");

        if (baloo.descansito(3)){
            System.out.println("Venga vale, fuera de aquí");
        }else{
            System.out.println("Tomad pañuelos, a seguir programando");
        }

        System.out.println("Yo soy " + galistei.getNombre() + ", tengo " +galistei.edad+ " años, y mis asignaturas son " + galistei.getAsignatura());
        System.out.println(galistei.fraseCaracterística());
        System.out.println("Mi hora de llegada es " +galistei.horaDeLlegada());

        System.out.println("Iros a por churros");

        if (galistei.descansito(0)){
            System.out.println("Nunca se ha dado este caso, siempre nos manda a comprarlos cuando está cerrada la tienda");
        }else {
            System.out.println("La próxima será");
        }

    }
}
