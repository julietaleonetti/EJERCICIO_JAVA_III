package Distribuidora;

public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        setNombre(nombre);
        setPrecio(precio);
    }

    public Producto() {
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    private void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Distribuidora.Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    public double calcular(int cantidadDeProductos){
        double  devolver;
        devolver = precio * cantidadDeProductos;
        return devolver;
    }
}
