public class ejer2 {

    // Método que recibe dos arreglos de tipo String y devuelve true si el pan coincide, o false si no
    public static boolean hasSameBread(String[] sandwich1, String[] sandwich2) {
        // Compara si la primera pieza de pan (índice 0) y la última pieza de pan (índice 2) 
        // de ambos sándwiches son exactamente iguales.
        boolean mismoPanInicial = sandwich1[0].equals(sandwich2[0]);
        boolean mismoPanFinal = sandwich1[2].equals(sandwich2[2]);

        // Si ambos extremos coinciden, devuelve true; de lo contrario, devuelve false
        return mismoPanInicial && mismoPanFinal;
    }

    public static void main(String[] args) {
        // Ejemplo 1: Debería retornar true[cite: 2]
        String[] s1 = {"pan blanco", "lechuga", "pan blanco"};
        String[] s2 = {"pan blanco", "tomate", "pan blanco"};
        System.out.println("Caso 1: " + hasSameBread(s1, s2)); // Imprime true

        // Ejemplo 2: Debería retornar false[cite: 2]
        String[] s3 = {"pan integral", "pollo", "pan integral"};
        String[] s4 = {"pan blanco", "pollo", "pan blanco"};
        System.out.println("Caso 2: " + hasSameBread(s3, s4)); // Imprime false

        // Ejemplo 3: Debería retornar false[cite: 2, 3]
        String[] s5 = {"tostada", "queso", "tostada"};
        String[] s6 = {"pan integral", "queso", "tostada"};
        System.out.println("Caso 3: " + hasSameBread(s5, s6)); // Imprime false
    }
}