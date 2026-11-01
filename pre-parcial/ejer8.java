public class ejer8 {

    // Método que recibe un arreglo de enteros y devuelve la diferencia entre la suma de pares e impares
    public static int warOfNumbers(int[] numeros) {
        // Inicializamos las variables para acumular las sumas en 0
        int sumaPares = 0;
        int sumaImpares = 0;

        // Recorremos cada número del arreglo usando un bucle for-each
        for (int numero : numeros) {
            // Evaluamos si el número es par (su residuo al dividir entre 2 es 0)
            if (numero % 2 == 0) {
                // Si es par, lo sumamos al acumulador de pares
                sumaPares += numero;
            } else {
                // Si no es par (es impar), lo sumamos al acumulador de impares
                sumaImpares += numero;
            }
        }

        // Determinamos cuál suma es mayor y restamos la menor para obtener la diferencia positiva
        if (sumaPares > sumaImpares) {
            return sumaPares - sumaImpares;
        } else {
            return sumaImpares - sumaPares;
        }
    }

    public static void main(String[] args) {
        // Ejemplo 1: [2, 8, 7, 5] -> Pares (10), Impares (12) -> 12 - 10 = 2
        int[] caso1 = {2, 8, 7, 5};
        System.out.println("Caso 1: " + warOfNumbers(caso1)); // Imprime 2

        // Ejemplo 2: [12, 90, 75] -> Pares (102), Impares (75) -> 102 - 75 = 27
        int[] caso2 = {12, 90, 75};
        System.out.println("Caso 2: " + warOfNumbers(caso2)); // Imprime 27

        // Ejemplo 3
        int[] caso3 = {5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243};
        System.out.println("Caso 3: " + warOfNumbers(caso3)); // Imprime 168
    }
}