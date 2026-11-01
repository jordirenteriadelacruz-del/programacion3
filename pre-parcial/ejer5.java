import java.util.Arrays;

public class ejer5{

    // Método que recibe un arreglo de enteros y devuelve el segundo número más grande
    public static int secondLargest(int[] numeros) {
        // Ordena el arreglo de menor a mayor automáticamente
        Arrays.sort(numeros);

        // El número más grande siempre quedará en la última posición (tamaño del arreglo - 1).
        // Por lo tanto, el segundo número más grande estará en la penúltima posición (tamaño - 2).
        return numeros[numeros.length - 2];
    }

    public static void main(String[] args) {
        // Ejemplo 1: [10, 40, 30, 20, 50] -> Ordenado: [10, 20, 30, 40, 50] -> Segundo más grande: 40
        int[] caso1 = {10, 40, 30, 20, 50};
        System.out.println("Caso 1: " + secondLargest(caso1)); // Imprime 40

        // Ejemplo 2[cite: 5]
        int[] caso2 = {25, 143, 89, 13, 105};
        System.out.println("Caso 2: " + secondLargest(caso2)); // Imprime 105

        // Ejemplo 3[cite: 5]
        int[] caso3 = {54, 23, 11, 17, 10};
        System.out.println("Caso 3: " + secondLargest(caso3)); // Imprime 23
    }
}