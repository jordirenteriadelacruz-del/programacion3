package Parcial;

public class Sala {
    private int numero;
    private Silla[][] sillas;
    private boolean tienePreferencial;
    private boolean es3D;

    public Sala(int numero, boolean tienePreferencial, boolean es3D) {
        this.numero = numero;
        this.tienePreferencial = tienePreferencial;
        this.es3D = es3D;

        if (tienePreferencial) {
            this.sillas = new Silla[8][]; 
        } else {
            this.sillas = new Silla[6][]; 
        }
        inicializarSillas();
    }

    private void inicializarSillas() {
        char[] letras = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};

        // Filas generales (A-F) - 12 sillas cada una
        for (int i = 0; i < 6; i++) {
            sillas[i] = new Silla[12];
            for (int j = 0; j < 12; j++) {
                int precio = es3D ? 10000 : 8000;
                sillas[i][j] = new Silla(letras[i], j + 1, precio);
            }
        }

        // Filas preferenciales (G-H) - 9 sillas cada una
        if (tienePreferencial) {
            for (int i = 6; i < 8; i++) {
                sillas[i] = new Silla[9];
                for (int j = 0; j < 9; j++) {
                    sillas[i][j] = new Silla(letras[i], j + 1, 12000);
                }
            }
        }
    }

    public int getNumero() { return numero; }
    public boolean isTienePreferencial() { return tienePreferencial; }
    public boolean isEs3D() { return es3D; }
    public Silla[][] getSillas() { return sillas; }
    public int getFilas() { return sillas.length; }

    public int contarDisponibles() {
        int contador = 0;
        for (int i = 0; i < sillas.length; i++) {
            for (int j = 0; j < sillas[i].length; j++) {
                if (sillas[i][j].isDisponible()) {
                    contador++;
                }
            }
        }
        return contador;
    }
}

