package Parcial;


   public class Main {
    public static void main(String[] args) {
        
        // ==========================================
        // 1. PROBAR PELICULA
        // ==========================================
        System.out.println("========== PELICULAS ==========");
        
        Pelicula p1 = new Pelicula("Avatar", "Ingles", "3D", 162);
        Pelicula p2 = new Pelicula("Titanic", "Español", "35mm", 195);
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println("Nombre de p1: " + p1.getNombre());
        System.out.println("Tipo de p2: " + p2.getTipo());
        
        // ==========================================
        // 2. PROBAR SILLA
        // ==========================================
        System.out.println("\n========== SILLAS ==========");
        
        silla s1 = new silla('A', 3, 8000);
        silla s2 = new silla('G', 4, 12000);
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("Identificador de s2: " + s2.getIdentificador());
        
        // Ocupar una silla
        s1.setDisponible(false);
        System.out.println("\nDespues de ocupar A3:");
        System.out.println(s1);
        
        // ==========================================
        // 3. PROBAR SALA 1 (con preferencial, no 3D)
        // ==========================================
        System.out.println("\n========== SALA 1 ==========");
        
        Sala sala1 = new Sala(1, true, false);
        sala1.mostrarSala();
        System.out.println("Sillas disponibles: " + sala1.contarDisponibles());
        
        // ==========================================
        // 4. PROBAR SALA 3 (sin preferencial, 3D)
        // ==========================================
        System.out.println("\n========== SALA 3 (3D) ==========");
        
        Sala sala3 = new Sala(3, false, true);
        sala3.mostrarSala();
        System.out.println("Sillas disponibles: " + sala3.contarDisponibles());
        
        // ==========================================
        // 5. OCUPAR UNA SILLA EN SALA 1
        // ==========================================
        System.out.println("\n========== OCUPANDO A3 EN SALA 1 ==========");
        
        sala1.getSillas()[0][2].setDisponible(false);   // fila a, silla 3
        sala1.mostrarSala();
        System.out.println("Sillas disponibles: " + sala1.contarDisponibles());
    }
}