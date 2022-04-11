package Excepciones;

public class PracticaExcepciones {

    public static void main(String[] args) {
        int a = 0;
        int b = 300;
        int devolver;

        try{
            devolver = b/a;
            throw new IllegalArgumentException("No se puede dividir por cero");
        }catch(ArithmeticException | IllegalArgumentException e ){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
