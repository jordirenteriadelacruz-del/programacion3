package Parcial;

public {
    
    // atributos
    private String nombre = "";
    private String idioma = "";
    private String tipo = ""; // ->>> si la quiere en 3d o 35mm
    private int duracion = 0; 

    //constructor
    public pelicula(String nombre, String idioma, String tipo, int duracion){
        this.nombre = nombre;
        this.idioma = idioma;
        this.tipo = tipo;
        this.duracion = duracion;

    }
    //gets
    public String getNombre(){return nombre;}
    public String getIdioma(){return idioma;}
    public String getTipo(){return tipo;}
    public int getDuracion(){return duracion;}

    //sets
    public void setNombre(String nombre){this.nombre = nombre;}
    public void setIdioma(String idioma){this.idioma = idioma;}
    public void setNombre(String tipo){this.tipo = tipo;}
    public void setDuracion(int duracion){this.duracion = duracion;}

    @Override 
    public String tosTring(){
        return "  Pelicula:  " + nombre +
               "  Idioma:  " + idioma +
               "  Tipo:  " + tipo +
               "Duracion:  " + duracion + " min";
    }


}
