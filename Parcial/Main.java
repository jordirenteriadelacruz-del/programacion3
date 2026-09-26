package Parcial;


   public class Main {
    public static void main(String[] args) {
        Pelicula p1 = new Pelicula("Avatar", "Ingles", "3D", 162);
        Pelicula p2 = new Pelicula("Titanic", "Español", "35mm", 195);
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println("Nombre de p1: " + p1.getNombre());
    }
}