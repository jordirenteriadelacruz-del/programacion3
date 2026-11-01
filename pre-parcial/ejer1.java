public class ejer1 {

    // Clase auxiliar para representar la estructura de votos (simulando el objeto del ejemplo)
    static class Voto {
        int upvotes;
        int downvotes;

        // Constructor para inicializar los votos positivos y negativos
        public Voto(int upvotes, int downvotes) {
            this.upvotes = upvotes;
            this.downvotes = downvotes;
        }
    }

    // Método principal que resuelve el problema del Punto 1
    public static int getVoteCount(Voto v) {
        // Resta los votos negativos (downvotes) de los positivos (upvotes) y devuelve el resultado
        return v.upvotes - v.downvotes;
    }

    public static void main(String[] args) {
        // Ejemplo 1: { upvotes: 13, downvotes: 0 } -> Esperado: 13
        Voto caso1 = new Voto(13, 0);
        System.out.println("Resultado Caso 1: " + getVoteCount(caso1)); // Imprime 13

        // Ejemplo 2: { upvotes: 2, downvotes: 33 } -> Esperado: -31
        Voto caso2 = new Voto(2, 33);
        System.out.println("Resultado Caso 2: " + getVoteCount(caso2)); // Imprime -31

        // Ejemplo 3: { upvotes: 132, downvotes: 132 } -> Esperado: 0
        Voto caso3 = new Voto(132, 132);
        System.out.println("Resultado Caso 3: " + getVoteCount(caso3)); // Imprime 0
    }
}