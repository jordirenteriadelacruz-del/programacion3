import java.util.ArrayList;
import java.util.List;

public class InventarioSupermercado {
    public static void main(String[] args) {
        // 1. Declaración usando la interfaz 'List' y la implementación 'ArrayList'
        List<String> productosInventario = new ArrayList<>();

        // 2. Agregar elementos a la lista (método add)
        productosInventario.add("Manzanas");
        productosInventario.add("Leche desnatada");
        productosInventario.add("Pan integral");
        productosInventario.add("Café molido");

        System.out.println("--- INVENTARIO INICIAL ---");
        System.out.println("Total de productos: " + productosInventario.size());
        
        // Mostrar todos los elementos usando un bucle for-each
        for (String producto : productosInventario) {
            System.out.println("- " + producto);
        }

        // 3. Buscar si un elemento existe en la lista (método contains)
        String productoBuscado = "Leche desnatada";
        if (productosInventario.contains(productoBuscado)) {
            System.out.println("\n[Alerta] El producto '" + productoBuscado + "' SÍ está disponible en el inventario.");
        }

        // 4. Obtener un elemento específico por su posición o índice (método get)
        // Las listas empiezan a contar desde el índice 0
        String primerProducto = productosInventario.get(0);
        System.out.println("El primer producto registrado es: " + primerProducto);

        // 5. Eliminar un elemento que ya se agotó (método remove)
        productosInventario.remove("Pan integral"); // Se puede eliminar por objeto o por índice
        System.out.println("\n--- INVENTARIO TRAS VENDER EL PAN INTEGRAL ---");
        
        // Mostrar el inventario actualizado
        for (int i = 0; i < productosInventario.size(); i++) {
            System.out.println("Posición " + i + ": " + productosInventario.get(i));
        }
    }
}