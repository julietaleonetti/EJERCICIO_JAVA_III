package Distribuidora;

public class Perecedero  extends Producto {

    private int diasPorCaducar;

    public Perecedero(String nombre, double precio, int diasPorCaducar) {
        super(nombre, precio);
        setDiasPorCaducar(diasPorCaducar);
    }

    public int getDiasPorCaducar() {
        return diasPorCaducar;
    }

    private void setDiasPorCaducar(int diasPorCaducar) {
        this.diasPorCaducar = diasPorCaducar;
    }

    @Override
    public String toString() {
        return "Distribuidora.Perecedero{" +
                "diasPorCaducar=" + diasPorCaducar +
                '}';
    }

    @Override
    public double calcular(int cantidadDeProductos) {
        double precioFinal = super.calcular(cantidadDeProductos);
        double total = precioFinal;

        if(diasPorCaducar == 1){
            total = precioFinal / 4;
        } else {
            if(diasPorCaducar == 2){
                total = precioFinal / 3;
            } else {
                if (diasPorCaducar == 3){
                    total = precioFinal / 2 ;
                }
            }
        }

        return total;

    }
}
