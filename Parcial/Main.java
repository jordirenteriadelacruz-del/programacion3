package Parcial;


   public class Main {
    public static void main(String[] args) {
        
         
        Pelicula p1 = new Pelicula("Avatar", "Ingles", "3D", 162);
        System.out.println("=== PELICULAS ===");
        System.out.println(p1);
        
        
        silla s1 = new silla('A', 3, 8000);
        silla s2 = new silla('G', 4, 12000);
        
        System.out.println("\n=== SILLAS ===");
        System.out.println(s1);
        System.out.println(s2);
        
        
        s1.setDisponible(false);
        System.out.println("\n=== DESPUES DE OCUPAR A3 ===");
        System.out.println(s1);
        
        
        System.out.println("\n=== IDENTIFICADOR ===");
        System.out.println("Identificador de s2: " + s2.getIdentificador());
    }
}