public class EjemploExcepciones {
    public static void main(String[] args) {
        //ArithmeticException
        try {
            int resultado = dividir(10, 0);
            System.out.println("Resultado de la división: " + resultado);
        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
        }

        //NullPointerException
        try {
            String texto = null;
            int longitud = texto.length();
            System.out.println("Longitud del texto: " + longitud);
        } catch (NullPointerException e) {
            System.err.println("Error: " + e.getMessage());
        }

        //ArrayIndexOutOfBoundsException
        try {
            int[] array = {1, 2, 3};
            int valor = array[5];
            System.out.println("Valor del array: " + valor);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static int dividir(int numerador, int denominador) {
        return numerador / denominador;
    }
}
