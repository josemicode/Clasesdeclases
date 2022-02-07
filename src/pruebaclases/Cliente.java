package pruebaclases;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
                                    //Atributos
    private String nombre;
    private double saldo;
    private List<Articulo> carrito;
    private List<Articulo> propiedad;

                                    //Constructor


    public Cliente(String nombre, double saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
        this.carrito = new ArrayList<Articulo>();
        this.propiedad = new ArrayList<Articulo>();
    }

                                    //Getters & Setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public List<Articulo> getCarrito() {
        return carrito;
    }

    public void setCarrito(List<Articulo> carrito) {
        this.carrito = carrito;
    }

    public List<Articulo> getPropiedad() {
        return propiedad;
    }

    public void setPropiedad(List<Articulo> propiedad) {
        this.propiedad = propiedad;
    }

                                //Métodos

    public void anadirProducto(Tienda mercado, int productoPos, int cantidad) {

        Articulo art1 = new Articulo(mercado.ventaProducto(productoPos, cantidad).getNombre(),mercado.getProducto().get(productoPos).getPrecio(),cantidad);

        getCarrito().add(art1);

        getCarrito().get(productoPos).setStock(cantidad);

    }

    public void comprarProductos() {

        double preciototal = 0;

        for (int i = 0; i < getCarrito().size(); i++) {

            preciototal += getCarrito().get(i).getPrecio();

        }

        if (getSaldo()>=preciototal) {

            for (int i = 0; i < getCarrito().size(); i++) {

                getPropiedad().add(getCarrito().get(i));
                getCarrito().remove(i);
            }

            aumentarSaldo(-preciototal);
        }

    }

    public void aumentarSaldo(double cantidad) {
        saldo += cantidad;
    }

    public void devolverProducto(Tienda mercado, int productoPos, int cantidad) {

        double preciototal = 0;

        for (int i = 0; i < getPropiedad().size(); i++) {

            preciototal += getPropiedad().get(i).getPrecio();

            if(getPropiedad().get(i).getNombre().equals(mercado.getProducto().get(i).getNombre())) {
                mercado.reponerStock(i, getPropiedad().get(i).getStock());
                getPropiedad().remove(i);
            }

        }

        aumentarSaldo(preciototal);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", saldo=" + saldo +
                ", carrito=" + carrito +
                ", propiedad=" + propiedad +
                '}';
    }
}
