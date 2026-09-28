package Parcial;

public class Funcion {
    private Pelicula pelicula;
    private Sala sala;
    private int franja;
    private boolean[][] sillasOcupadas;

    public Funcion(Pelicula pelicula, Sala sala, int franja) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.franja = franja;

        this.sillasOcupadas = new boolean[sala.getSillas().length][];
        for (int i = 0; i < sala.getSillas().length; i++) {
            this.sillasOcupadas[i] = new boolean[sala.getSillas()[i].length];
        }
    }

    public Pelicula getPelicula() { return pelicula; }
    public Sala getSala() { return sala; }
    public int getFranja() { return franja; }
    public boolean[][] getSillasOcupadas() { return sillasOcupadas; }

    public String getHorario() {
        if (franja == 1) return "14:00 - 16:30";
        if (franja == 2) return "16:30 - 19:00";
        return "19:00 - 21:00";
    }

    public boolean ocuparSilla(int fila, int columna) {
        if (sillasOcupadas[fila][columna]) {
            return false;
        }
        sillasOcupadas[fila][columna] = true;
        return true;
    }

    public int contarDisponibles() {
        int contador = 0;
        for (int i = 0; i < sillasOcupadas.length; i++) {
            for (int j = 0; j < sillasOcupadas[i].length; j++) {
                if (!sillasOcupadas[i][j]) {
                    contador++;
                }
            }
        }
        return contador;
    }

    public void mostrarEsquema() {
        System.out.println("\n=== ESQUEMA DE LA SALA ===");
        System.out.println("Pelicula: " + pelicula.getNombre());
        System.out.println("Sala: " + sala.getNumero());
        System.out.println("Horario: " + getHorario());
        System.out.println("Sillas disponibles: " + contarDisponibles() + "\n");

        Silla[][] sillas = sala.getSillas();
        for (int i = 0; i < sillasOcupadas.length; i++) {
            for (int j = 0; j < sillasOcupadas[i].length; j++) {
                if (sillasOcupadas[i][j]) {
                    System.out.print("X  ");
                } else {
                    System.out.print("-  ");
                }
            }
            System.out.println("<- Fila " + sillas[i][0].getFila());
        }
    }
}