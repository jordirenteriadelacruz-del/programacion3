import java.util.Arrays;

public class ejer6 {

    // Método que recibe un arreglo de nombres y devuelve el nombre de la sociedad secreta
    public static String societyName(String[] nombres) {
        // Creamos un arreglo de caracteres del mismo tamaño que el número de nombres
        char[] iniciales = new char[nombres.length];

        // Recorremos cada nombre del arreglo
        for (int i = 0; i < nombres.length; i++) {
            // Convertimos todo el nombre a mayúsculas y extraemos la primera letra (índice 0)
            iniciales[i] = nombres[i].toUpperCase().charAt(0);
        }

        // Ordenamos las iniciales alfabéticamente
        Arrays.sort(iniciales);

        // Convertimos el arreglo de caracteres ordenado en un String y lo devolvemos
        return new String(iniciales);
    }

    public static void main(String[] args) {
        // Ejemplo 1: ["Adam", "Sarah", "Malcolm"] -> "AMS"
        String[] caso1 = {"Adam", "Sarah", "Malcolm"};
        System.out.println("Caso 1: " + societyName(caso1)); // Imprime "AMS"

        // Ejemplo 2: ["Harry", "Newt", "Luna", "Cho"] -> "CHLN"[cite: 5]
        String[] caso2 = {"Harry", "Newt", "Luna", "Cho"};
        System.out.println("Caso 2: " + societyName(caso2)); // Imprime "CHLN"

        // Ejemplo 3: ["Phoebe", "Chandler", "Rachel", "Ross", "Monica", "Joey"] -> "CJMPRR"[cite: 5]
        String[] caso3 = {"Phoebe", "Chandler", "Rachel", "Ross", "Monica", "Joey"};
        System.out.println("Caso 3: " + societyName(caso3)); // Imprime "CJMPRR"
    }
}