import java.util.ArrayList;
import java.util.List;

public class ejer7 {

    // Método que recibe un arreglo de cadenas y devuelve una List con las palabras de cuatro letras
    public static List<String> isFourLetters(String[] palabras) {
        // Creamos una lista dinámica (ArrayList) para almacenar las palabras que cumplan con la condición
        List<String> resultado = new ArrayList<>();

        // Recorremos cada palabra del arreglo recibido utilizando un bucle for-each
        for (String palabra : palabras) {
            // Verificamos si la longitud de la palabra es exactamente igual a 4 caracteres
            if (palabra.length() == 4) {
                // Si tiene 4 letras, la agregamos a nuestra lista dinámica con .add()
                resultado.add(palabra);
            }
        }

        // Devolvemos la lista resultante con las palabras filtradas
        return resultado;
    }

    public static void main(String[] args) {
        // Ejemplo 1[cite: 4]
        String[] caso1 = {"Tomate", "Papa", "Par"};
        System.out.println("Caso 1: " + isFourLetters(caso1)); // Imprime [Papa]

        // Ejemplo 2[cite: 4]
        String[] caso2 = {"Canguro", "Oso", "Zorro"};
        System.out.println("Caso 2: " + isFourLetters(caso2)); // Imprime []

        // Ejemplo 3[cite: 4]
        String[] caso3 = {"Ryan", "Kieran", "Jason", "Matt"};
        System.out.println("Caso 3: " + isFourLetters(caso3)); // Imprime [Ryan, Matt]
    }
}