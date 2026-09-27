package Parcial;


    public class Sala {
    
    // Atributos
    private int numero;
    private silla[][] sillas;
    private int filas;
    private int columnas;
    private boolean tienePreferencial;
    private boolean es3D;
    
    // Constructor
    public Sala(int numero, boolean tienePreferencial, boolean es3D) {
        this.numero = numero;
        this.tienePreferencial = tienePreferencial;
        this.es3D = es3D;
        this.filas = 6;   // filas a-f
        this.columnas = 12;
        
        // Crear matriz de sillas
        if (tienePreferencial) {
            this.sillas = new silla[8][];  // 6 generales + 2 preferenciales
        } else {
            this.sillas = new silla[6][];  // solo generales
        }
        
        inicializarSillas();
    }
    
    // Inicializar sillas
    private void inicializarSillas() {
        char[] letras = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        
        // Filas generales (a-f) - 12 sillas cada una
        for (int i = 0; i < 6; i++) {
            sillas[i] = new silla[12];
            for (int j = 0; j < 12; j++) {
                int precio = es3D ? 10000 : 8000;
                sillas[i][j] = new silla(letras[i], j + 1, precio);
            }
        }
        
        // Filas preferenciales (g-h) - 9 sillas cada una
        if (tienePreferencial) {
            for (int i = 6; i < 8; i++) {
                sillas[i] = new silla[9];
                for (int j = 0; j < 9; j++) {
                    sillas[i][j] = new silla(letras[i], j + 1, 12000);
                }
            }
        }
    }
    
    // Getters
    public int getNumero() { return numero; }
    public boolean isTienePreferencial() { return tienePreferencial; }
    public boolean isEs3D() { return es3D; }
    public silla[][] getSillas() { return sillas; }
    public int getFilas() { return sillas.length; }
    
    // Contar sillas disponibles
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
    
    // Mostrar sala (esquema visual)
    public void mostrarSala() {
        System.out.println("=== SALA " + numero + " ===");
        for (int i = 0; i < sillas.length; i++) {
            for (int j = 0; j < sillas[i].length; j++) {
                if (sillas[i][j].isDisponible()) {
                    System.out.print("- ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println(" <- Fila " + sillas[i][0].getFila());
        }
    }
}


