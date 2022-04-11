package Distribuidora;

import java.util.*;

public class Distribuidora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Producto> listaProducto = new ArrayList<Producto>();

       listaProducto.add(new Perecedero("Leche", 150, 1));
       listaProducto.add(new Perecedero("Cereal", 330, 300));
       listaProducto.add(new Perecedero("Queso", 1000, 3));
       listaProducto.add(new Perecedero("Fideos", 100.02, 2));
       listaProducto.add(new Perecedero("Aceite", 500, 1));

       listaProducto.add(new NoPerecedero("lentejas", 500, "Dulce"));
       listaProducto.add(new NoPerecedero("sal", 500, "Salado"));
       listaProducto.add(new NoPerecedero("arbejas", 500, "Enlatado"));
       listaProducto.add(new NoPerecedero("silla", 500, "muebles"));
       listaProducto.add(new NoPerecedero("Heladera", 500, "electrodomestico"));

        for(Producto p : listaProducto){
            System.out.println(" El producto " +  p.getNombre() + " vale $ " + p.calcular(5));

        }




    }

}
