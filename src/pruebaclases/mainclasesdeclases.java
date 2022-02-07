package pruebaclases;

public class mainclasesdeclases {
    public static void main(String[] args) {

        Articulo pepperoni = new Articulo("pepperoni", 12.0, 30);
        Articulo pimiento = new Articulo("pimientito", 5.5, 15);

        Tienda kiosko = new Tienda("PepeProductos", "Mordor");

        kiosko.addProducto(pepperoni);
        kiosko.addProducto(pimiento);

        Cliente josemi = new Cliente("Josemi", 2000);

        josemi.anadirProducto(kiosko, 0, 2);
        josemi.comprarProductos();

        josemi.devolverProducto(kiosko, 0, 2);

        System.out.println(josemi.getSaldo());

        System.out.println(kiosko.getProducto());

    }
}
