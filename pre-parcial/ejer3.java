public class ejer3 {

    // Método que recibe un arreglo de dos números positivos y devuelve true o false
    public static boolean checkSquareAndCube(double[] numeros) {
        // Math.sqrt() calcula la raíz cuadrada del primer número (posición 0)
        double raizCuadrada = Math.sqrt(numeros[0]);

        // Math.cbrt() calcula la raíz cúbica del segundo número (posición 1)
        double raizCubica = Math.cbrt(numeros[1]);

        // Compara si ambos resultados son iguales (usando una pequeña tolerancia o igualdad directa)
        // Como son enteros exactos en los casos de prueba, podemos usar '=='
        return raizCuadrada == raizCubica;
    }

    public static void main(String[] args) {
        // Ejemplo 1: [4, 8] -> Raiz cuadrada de 4 es 2, raiz cubica de 8 es 2 -> true[cite: 3]
        double[] caso1 = {4, 8};
        System.out.println("Caso 1: " + checkSquareAndCube(caso1)); // Imprime true

        // Ejemplo 2: [16, 48] -> Falso[cite: 3]
        double[] caso2 = {16, 48};
        System.out.println("Caso 2: " + checkSquareAndCube(caso2)); // Imprime false

        // Ejemplo 3: [9, 27] -> Raiz cuadrada de 9 es 3, raiz cubica de 27 es 3 -> true[cite: 3]
        double[] caso3 = {9, 27};
        System.out.println("Caso 3: " + checkSquareAndCube(caso3)); // Imprime true
    }
}