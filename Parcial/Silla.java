package Parcial;

public class Silla {
    private char fila;
    private int numero;
    private boolean disponible;
    private int precio;

    public Silla(char fila, int numero, int precio) {
        this.fila = fila;
        this.numero = numero;
        this.precio = precio;
        this.disponible = true;
    }

    public char getFila() { return fila; }
    public int getNumero() { return numero; }
    public boolean isDisponible() { return disponible; }
    public int getPrecio() { return precio; }

    public void setDisponible(boolean disponible) { this.disponible = disponible; }
    public void setPrecio(int precio) { this.precio = precio; }

    public String getIdentificador() {
        return "" + Character.toUpperCase(fila) + numero;
    }

    @Override
    public String toString() {
        String estado = disponible ? "Disponible" : "Ocupada";
        return getIdentificador() + " - " + estado + " - $" + precio;
    }
}