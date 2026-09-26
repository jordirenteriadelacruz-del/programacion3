package Parcial;

public class silla {
    
    // Atributos
    private char fila;
    private int numero;
    private boolean disponible;
    private int precio;
    
    // Constructor
    public silla(char fila, int numero, int precio) {
        this.fila = fila;
        this.numero = numero;
        this.precio = precio;
        this.disponible = true;  
    }
    
    // Gets
    public char getFila() { return fila; }
    public int getNumero() { return numero; }
    public boolean isDisponible() { return disponible; }
    public int getPrecio() { return precio; }
    
    // Sets
    public void setDisponible(boolean disponible) { this.disponible = disponible; }
    public void setPrecio(int precio) { this.precio = precio; }
    

    public String getIdentificador() {
        return "" + fila + numero;   // ejemplo: "A3", "G4"
    }
    
    @Override
    public String toString() {
        String estado = disponible ? "Disponible" : "Ocupada";
        return getIdentificador() + " - " + estado + " - $" + precio;
    }
}