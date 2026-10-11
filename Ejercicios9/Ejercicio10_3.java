package Ejercicios9;
import java.util.Queue;
import java.util.LinkedList;

public class Ejercicio10_3 {
    public static void main(String[] args) {
        Queue<String> carritosDisponibles = new LinkedList<>();
        for (int i = 1; i <= 25; i++) {
            carritosDisponibles.offer("Carrito #" + i);
        }

        @SuppressWarnings("unchecked")
        Queue<String>[] cajas = new LinkedList[3];
        for (int i = 0; i < 3; i++) {
            cajas[i] = new LinkedList<>();
        }

        if (!carritosDisponibles.isEmpty()) {
            String carritoAsignado = carritosDisponibles.poll();
            System.out.println("Cliente toma el " + carritoAsignado);
            cajas[0].offer("Cliente con " + carritoAsignado);
        }

        String clienteSaliendo = cajas[0].poll();
        if (clienteSaliendo != null) {
            carritosDisponibles.offer("Carrito devuelto");
            System.out.println(clienteSaliendo + " pagó y liberó su carrito.");
        }
        
        System.out.println("Carritos disponibles actualmente: " + carritosDisponibles.size());
    }
}