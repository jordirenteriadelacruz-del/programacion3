package Parcial;

public class Main {
    public static void main(String[] args) {
        
      
        // 1. PROBAR LA PELICULA
   
        System.out.println("= PELICULAS =");
        
        Pelicula p1 = new Pelicula("Avatar", "Ingles", "3D", 162);
        Pelicula p2 = new Pelicula("Titanic", "Español", "35mm", 195);
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println("Nombre de p1: " + p1.getNombre());
        System.out.println("Tipo de p2: " + p2.getTipo());
        
    
        // 2. PROBAR LA SILLA
      
        System.out.println("\n= SILLAS =");
        
        silla s1 = new silla('A', 3, 8000);
        silla s2 = new silla('G', 4, 12000);
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("Identificador de s2: " + s2.getIdentificador());
        
        s1.setDisponible(false);
        System.out.println("\nDespues de ocupar A3:");
        System.out.println(s1);
        
      
        // 3. PROBAR LA SALA 1
     
        System.out.println("\n=SALA 1 =");
        
        Sala sala1 = new Sala(1, true, false);
        sala1.mostrarSala();
        System.out.println("Sillas disponibles: " + sala1.contarDisponibles());
        
   
        // 4. PROBAR LA SALA 3
       
        System.out.println("\n= SALA 3 (3D) =");
        
        Sala sala3 = new Sala(3, false, true);
        sala3.mostrarSala();
        System.out.println("Sillas disponibles: " + sala3.contarDisponibles());
 
        // 5. PROBAR LA FUNCION
       
        System.out.println("\n= FUNCION =");
        
        Funcion f1 = new Funcion(p1, sala1, 1);
        f1.mostrarEsquema();
        
        
        // 6. OCUPAR SILLAS EN LA FUNCION
       
        System.out.println("\n========== OCUPANDO SILLAS ==========");
        
        f1.ocuparSilla(0, 2);   // A3
        f1.ocuparSilla(1, 7);   // B8
        f1.ocuparSilla(3, 8);   // D9
        
        f1.mostrarEsquema();
    }
}