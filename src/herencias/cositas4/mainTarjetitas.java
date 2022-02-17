package herencias.cositas4;

public class mainTarjetitas {
    public static void main(String[] args) {

        Tarjeta visa = new Tarjeta("abc", "30282656M", 9898, 300);

        System.out.println("Nuestros datos personales constan de un id "+visa.getId()+", un dni del Titular " +visa.getDniTitular()+ ", el cual deberá de coincidir con el introducido en el caso de querer comprar() con dicho método, un pin el cual no se puede mostrar en una cadena porque no tiene getter, y finalmente una cantidad de dinero ingresada en la tarjeta: " + visa.getSaldo());

        System.out.println("Ahora comprobaremos lo que pasa en el caso de intentar comprar introduciendo el dni del titular mal:");

        visa.comprar(100, "XD");

        System.out.println("Como podemos ver, el saldo no ha sido modificado: " + visa.getSaldo());

        visa.comprar(12000, "30282656M");

        System.out.println("Lo mismo sucederá si excedemos el saldo con el importe: " + visa.getSaldo());

        visa.comprar(100, "30282656M");

        System.out.println("Sin embargo sí se verá reducido al introducir los datos coherentemente: " +visa.getSaldo());

        System.out.println("Por otro lado, el método retirar, aún teniendo también en cuenta el importe, difiere del método comprar en el dato que debe de ser introducido, cambiando el dni por el pin. ");

        visa.retirar(50, 1234);

        System.out.println("Esto es lo que pasará si intentamos llevarlo a cabo con un pin erróneo: " + visa.getSaldo());

        visa.retirar(50, 9898);

        System.out.println("Esto es lo que pasa si se hace correctamente: " +visa.getSaldo());

        System.out.println("Por último, tenemos el método cargo, el cual toma como único parámetro el importe y, siendo coherente, se realizará la operación.");

        visa.cargo(20);

        System.out.println("Tal que así: " +visa.getSaldo());

        if (visa.cargo(1)){
            System.out.println("Siendo así que devuelve además un booleano en caso de llevarse a cabo correctamente, pues este texto es resultado de dicha condición.");
        }else{
            System.out.println("Este otro no lo vas a ver porque no se da la condición, a no ser que modifiques el importe y pongas un número mayor al saldo.");
        }


    }
}
