import java.util.ArrayList;
import java.util.List;

public class RegistroEstudiantes {
    public static void main(String[] args) {
        // 1. Declaración de la lista combinando la interfaz (List) y la implementación (ArrayList).
        // 'List' define el comportamiento general de la lista y 'ArrayList' crea el arreglo dinámico en memoria.
        List<String> listaEstudiantes = new ArrayList<>();

       
        listaEstudiantes.add("Ana Gómez");
        listaEstudiantes.add("Carlos Pérez");
        listaEstudiantes.add("María Rodríguez");
        listaEstudiantes.add("Juan López");

       
        System.out.println(" LISTA INICIAL DE ESTUDIANTES ");

        // 7. Método .size(): Devuelve el número total de elementos actuales en la lista (en este caso, 4).
        System.out.println("Total de inscritos: " + listaEstudiantes.size());

        // 8. Bucle for-each: Recorre automáticamente cada elemento de la lista uno por uno.
        // En cada vuelta, guarda temporalmente el nombre del estudiante actual en la variable 'estudiante'.
        for (String estudiante : listaEstudiantes) {
            // Imprime cada estudiante precedido por un punto.
            System.out.println("• " + estudiante);
        }

        // 9. Se declara una variable de tipo String con el nombre del estudiante que queremos buscar.
        String estudianteBuscado = "Carlos Pérez";

        // 10. Método .contains(): Revisa toda la lista para verificar si el texto guardado en 'estudianteBuscado' existe.
        // Devuelve 'true' si lo encuentra o 'false' si no está.
        if (listaEstudiantes.contains(estudianteBuscado)) {
            // Si es verdadero, entra aquí y muestra un mensaje de confirmación en la consola.
            System.out.println("\nEl/la estudiante " + estudianteBuscado + " SÍ está matriculado(a).");
        }

        // 11. Método .get(0): Va directamente a la posición (índice) 0 de la lista y extrae su valor ("Ana Gómez").
        // Recuerda que las listas empiezan a contar desde el 0.
        String delegado = listaEstudiantes.get(0);

        // Imprime el valor obtenido de la primera posición.
        System.out.println("El/la primer estudiante de la lista (delegado/a) es: " + delegado);

        // 12. Método .remove(): Busca el objeto "Juan López" dentro de la lista y lo elimina automáticamente.
        // El ArrayList reajusta los espacios internos de forma automática.
        listaEstudiantes.remove("Juan López");
        
        // Imprime textos informativos sobre la actualización de la lista.
        System.out.println("\n LISTA ACTUALIZADA TRAS BAJAS ");
        System.out.println("Total de inscritos ahora: " + listaEstudiantes.size());

        // 13. Bucle for clásico: Utiliza un contador numérico 'i' que empieza en 0.
        // Se repite mientras 'i' sea menor al tamaño actual de la lista (.size()), aumentando de 1 en 1 (i++).
        for (int i = 0; i < listaEstudiantes.size(); i++) {
            // Imprime la posición numérica actual [i] y usa .get(i) para extraer el estudiante de esa posición exacta.
            System.out.println("Posición [" + i + "]: " + listaEstudiantes.get(i));
        }
    }
}