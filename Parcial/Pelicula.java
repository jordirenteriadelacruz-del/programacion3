package Parcial;

public class Pelicula {
    
    // Atributos
    private String nombre;
    private String idioma;
    private String tipo;       // "35mm" o "3D"
    private int duracion;      // en minutos
    
    // Constructor
    public Pelicula(String nombre, String idioma, String tipo, int duracion) {
        this.nombre = nombre;
        this.idioma = idioma;
        this.tipo = tipo;
        this.duracion = duracion;
    }
    
    // Getters
    public String getNombre() { return nombre; }
    public String getIdioma() { return idioma; }
    public String getTipo() { return tipo; }
    public int getDuracion() { return duracion; }
    
    // Setters (opcionales)
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setIdioma(String idioma) { this.idioma = idioma; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public void setDuracion(int duracion) { this.duracion = duracion; }
    
    // Método toString (para mostrar info)
    @Override
    public String toString() {
        return "Pelicula: " + nombre + 
               " | Idioma: " + idioma + 
               " | Tipo: " + tipo + 
               " | Duracion: " + duracion + " min";
    }
}
