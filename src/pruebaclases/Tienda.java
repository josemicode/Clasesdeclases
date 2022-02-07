package pruebaclases;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
                                    //Atributos
    private List<Articulo>producto;
    private String nombre;
    private String direccion;

                                    //Constructor


    public Tienda(String nombre, String direccion) {
        this.producto = new ArrayList<Articulo>();
        this.nombre = nombre;
        this.direccion = direccion;
    }

                                    //Getters & Setters


    public List<Articulo> getProducto() {
        return producto;
    }

    public void setProducto(List<Articulo> producto) {
        this.producto = producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

                                    //Métodos

    public void reponerStock(int productoPos, int cant) { //repone el stock según parámetros

        getProducto().get(productoPos).aumentaStock(cant);

    }

    public void reducirStock(int productoPos, int cant) { //reduce el stock según parámetros

        getProducto().get(productoPos).disminuyeStock(cant);

    }

    public Articulo ventaProducto(int productoPos, int cant) { // disminuye el stock de cierto artículo en una cantidad y lo devuelve al cliente

        Articulo artAux =  getProducto().get(productoPos);

        reducirStock(productoPos, cant);

        return
               artAux;
    }

    public void addProducto(Articulo nuevoProducto) {  // añade un artículo nuevo al arraylist de artículos

        getProducto().add(nuevoProducto);

    }

    public void retirarProducto(int productoPos) { // quita un producto del arraylist de artículos

        getProducto().remove(productoPos);

    }

    public void ofertarProducto(int productoPos, int descuento) {

        int porcentaje = descuento/100;

        getProducto().get(productoPos).setPrecio(getProducto().get(productoPos).getPrecio()*porcentaje);

    }

    public void todoenOferta(int descuento) {

        int porcentaje = descuento/100;

        for (int i = 0; i < getProducto().size(); i++) {
            getProducto().get(i).setPrecio(getProducto().get(i).getPrecio()*porcentaje);
        }

    }

    @Override
    public String toString() {
        return "Tienda{" +
                "producto=" + producto +
                '}';
    }
}
