package Distribuidora;

public class NoPerecedero extends Producto {
    private String tipo;

    public NoPerecedero(String nombre, double precio, String tipo) {
        super(nombre, precio);
        setTipo(tipo);
    }

    public String getTipo() {
        return tipo;
    }

    private void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Distribuidora.NoPerecedero{" +
                "tipo='" + tipo + '\'' +
                '}';
    }

    @Override
    public double calcular(int cantidadDeProductos) {
        return super.calcular(cantidadDeProductos);
    }
}
