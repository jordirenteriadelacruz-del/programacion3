public class ejer4 {

    // Método que recibe un arreglo de 10 enteros y devuelve la cadena formateada
    public static String formatPhoneNumber(int[] numeros) {
        // Usamos la clase StringBuilder para construir el texto de forma eficiente
        StringBuilder telefono = new StringBuilder();

        // Agregamos el paréntesis de apertura al inicio
        telefono.append("(");
        
        // Agregamos los primeros 3 números (del índice 0 al 2)
        for (int i = 0; i < 3; i++) {
            telefono.append(numeros[i]);
        }
        
        // Agregamos el paréntesis de cierre y un espacio obligatorio según las notas
        telefono.append(") ");
        
        // Agregamos los siguientes 3 números (del índice 3 al 5)
        for (int i = 3; i < 6; i++) {
            telefono.append(numeros[i]);
        }
        
        // Agregamos un guion medio de separación
        telefono.append("-");
        
        // Agregamos los últimos 4 números restantes (del índice 6 al 9)
        for (int i = 6; i < 10; i++) {
            telefono.append(numeros[i]);
        }

        // Convertimos el StringBuilder a String y lo devolvemos
        return telefono.toString();
    }

    public static void main(String[] args) {
        // Ejemplo 1[cite: 4]
        int[] caso1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println("Caso 1: " + formatPhoneNumber(caso1)); // Imprime "(123) 456-7890"

        // Ejemplo 2[cite: 4]
        int[] caso2 = {5, 1, 9, 5, 5, 5, 4, 4, 6, 8};
        System.out.println("Caso 2: " + formatPhoneNumber(caso2)); // Imprime "(519) 555-4468"

        // Ejemplo 3[cite: 4]
        int[] caso3 = {3, 4, 5, 5, 0, 1, 2, 5, 2, 7};
        System.out.println("Caso 3: " + formatPhoneNumber(caso3)); // Imprime "(345) 501-2527"
    }
}