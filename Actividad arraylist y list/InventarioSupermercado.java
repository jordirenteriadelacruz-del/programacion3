import java.util.ArrayList;
import java.util.List;

public class InventarioSupermercado {
    public static void main(String[] args) {
// 1. Declaración de la lista combinando la interfaz (List) y la implementación (ArrayList).
        // 'List' define el comportamiento general de lista y 'ArrayList' crea el arreglo dinámico en memoria.
        List<String> productosInventario = new ArrayList<>();

       
        productosInventario.add("Manzanas");
        productosInventario.add("Leche desnatada"); 
        productosInventario.add("Pan integral");
        productosInventario.add("Café molido");

       
        System.out.println("--- INVENTARIO INICIAL ---");

        // 7. Método .size(): Devuelve el número total de elementos que tiene la lista (en este caso, 4).
        System.out.println("Total de productos: " + productosInventario.size());
        
        // 8. Bucle for-each: Recorre automáticamente cada elemento de la lista uno por uno.
        // En cada vuelta, guarda temporalmente el elemento actual en la variable 'producto'.
        for (String producto : productosInventario) {
            // Imprime cada producto precedido por un guion.
            System.out.println("- " + producto);
        }

        // 9. Se declara una variable de tipo String con el texto que queremos buscar.
        String productoBuscado = "Leche desnatada";

        // 10. Método .contains(): Revisa toda la lista para ver si el elemento guardado en 'productoBuscado' existe.
        // Devuelve 'true' si lo encuentra o 'false' si no está.
        if (productosInventario.contains(productoBuscado)) {
            // Si es verdadero, entra aquí y imprime un mensaje de confirmación en la consola.
            System.out.println("\nEl producto '" + productoBuscado + "' SÍ está disponible en el inventario.");
        }

        // 11. Método .get(0): Va directamente a la posición (índice) 0 de la lista y extrae su valor ("Manzanas").
        // Recuerda que las listas empiezan a contar desde el 0.
        String primerProducto = productosInventario.get(0);

        // Imprime el valor obtenido de la primera posición.
        System.out.println("El primer producto registrado es: " + primerProducto);

        // 12. Método .remove(): Busca el objeto "Pan integral" dentro de la lista y lo elimina automáticamente.
        // El ArrayList reajusta los espacios internos para que no queden huecos.
        productosInventario.remove("Pan integral"); 

        // Imprime un texto para indicar que la lista cambió.
        System.out.println("\n--- INVENTARIO TRAS VENDER UN PRODUCTO ---");
        
        // 13. Bucle for clásico: Utiliza un contador numérico 'i' que empieza en 0.
        // Se repite mientras 'i' sea menor al tamaño actual de la lista (.size()), aumentando de 1 en 1 (i++).
        for (int i = 0; i < productosInventario.size(); i++) {
            // Imprime la posición numérica actual (i) y usa .get(i) para extraer el elemento de esa posición exacta.
            System.out.println("Posición " + i + ": " + productosInventario.get(i));
        }
    }
}