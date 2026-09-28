package Parcial;

public class Teatro {
    private Pelicula[] peliculas;
    private int numPeliculas;
    private Sala[] salas;
    private Funcion[][] funciones; // [sala][franja]

    public Teatro() {
        this.peliculas = new Pelicula[20];
        this.numPeliculas = 0;

        this.salas = new Sala[3];
        salas[0] = new Sala(1, true, false);  // Sala 1: Preferencial, no 3D
        salas[1] = new Sala(2, true, false);  // Sala 2: Preferencial, no 3D
        salas[2] = new Sala(3, false, true);  // Sala 3: Sin preferencial, 3D

        this.funciones = new Funcion[3][3];
    }

    public boolean agregarPelicula(Pelicula p) {
        if (numPeliculas >= peliculas.length) {
            return false;
        }
        peliculas[numPeliculas] = p;
        numPeliculas++;
        return true;
    }

    public void mostrarPeliculas() {
        if (numPeliculas == 0) {
            System.out.println("No hay peliculas registradas.");
            return;
        }
        System.out.println("=== PELICULAS REGISTRADAS ===");
        for (int i = 0; i < numPeliculas; i++) {
            System.out.println((i + 1) + ". " + peliculas[i]);
        }
    }

    public Pelicula getPelicula(int indice) {
        if (indice < 0 || indice >= numPeliculas) {
            return null;
        }
        return peliculas[indice];
    }

    public int getNumPeliculas() {
        return numPeliculas;
    }

    public Sala getSala(int numero) {
        if (numero < 1 || numero > 3) return null;
        return salas[numero - 1];
    }

    public boolean asignarFuncion(int sala, int franja, Pelicula pelicula) {
        if (sala < 1 || sala > 3 || franja < 1 || franja > 3) {
            return false;
        }
        if (funciones[sala - 1][franja - 1] != null) {
            return false;
        }

        boolean esPeli3D = pelicula.getTipo().trim().equalsIgnoreCase("3D");

        if (sala == 3) {
            if (!esPeli3D) return false;
        } else {
            if (esPeli3D) return false;
        }

        funciones[sala - 1][franja - 1] = new Funcion(pelicula, salas[sala - 1], franja);
        return true;
    }

    public Funcion getFuncion(int sala, int franja) {
        if (sala < 1 || sala > 3 || franja < 1 || franja > 3) return null;
        return funciones[sala - 1][franja - 1];
    }
}
