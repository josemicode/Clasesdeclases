package pruebaclases;

public class Articulo {
                                //Atributos
    private String nombre;
    private double precio;
    private int stock;

                                //Constructor


    public Articulo(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

                                //Getters & Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

                                //Métodos

    public void aumentaStock(int cant) { //aumenta el stock siguiendo el parámetro cantidad
        this.stock += cant;
    }

    public void disminuyeStock(int cant) { //disminuye el stock siguiendo el parámetro cantidad
        this.stock -= cant;
    }

    public void aumentaPrecio(double cant) { //aumenta el precio siguiendo el parámetro cantidad
        this.precio += cant;
    }

    public void disminuyePrecio(double cant) {  //disminuye el stock siguiendo el parámetro cantidad
        this.stock -= cant;
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                '}';
    }
}
