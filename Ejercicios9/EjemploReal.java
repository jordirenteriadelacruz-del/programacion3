package Ejercicios9; 
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class EjemploReal {
    public static void main(String[] args) {
        
        // ==========================================
        // 1. DEMOSTRACIÓN DE PILA (STACK) - Platos
        // ==========================================
        System.out.println("=== 1. EJEMPLO REAL DE PILA (Torre de Platos) ===");
        Stack<String> pilaPlatos = new Stack<>();
        
        // push(): Insertar elementos en la cima
        pilaPlatos.push("Plato 1 (Base)");
        pilaPlatos.push("Plato 2 (Medio)");
        pilaPlatos.push("Plato 3 (Cima)");
        System.out.println("Pila inicial de platos: " + pilaPlatos);

        // peek(): Ver el elemento que está en la cima sin sacarlo
        System.out.println("-> peek() - Plato en la cima: " + pilaPlatos.peek());

        // pop(): Retirar el elemento de la cima
        String platoLavado = pilaPlatos.pop();
        System.out.println("-> pop() - Se retiró para lavar: " + platoLavado);
        System.out.println("Pila después del pop: " + pilaPlatos);

        // size(): Ver cuántos elementos quedan
        System.out.println("-> size() - Platos restantes: " + pilaPlatos.size());

        // isEmpty(): Verificar si está vacía
        System.out.println("-> isEmpty() - ¿La pila está vacía?: " + pilaPlatos.isEmpty());


        // ==========================================
        // 2. DEMOSTRACIÓN DE COLA (QUEUE) - Taquilla
        // ==========================================
        System.out.println("\n=== 2. EJEMPLO REAL DE COLA (Taquilla de Cine) ===");
        Queue<String> filaTaquilla = new LinkedList<>();

        // offer(): Agregar elementos al final de la cola
        filaTaquilla.offer("Cliente 1: Carlos");
        filaTaquilla.offer("Cliente 2: María");
        filaTaquilla.offer("Cliente 3: Andrés");
        System.out.println("Fila inicial en la taquilla: " + filaTaquilla);

        // peek(): Ver quién está al frente de la cola sin sacarlo
        System.out.println("-> peek() - Siguiente a ser atendido: " + filaTaquilla.peek());

        // poll(): Atender y sacar al elemento que está al frente
        String clienteAtendido = filaTaquilla.poll();
        System.out.println("-> poll() - Atendido y sale de la fila: " + clienteAtendido);
        System.out.println("Fila después de atender al primero: " + filaTaquilla);

        // size(): Ver cuántas personas siguen esperando
        System.out.println("-> size() - Personas esperando en la fila: " + filaTaquilla.size());

        // isEmpty(): Verificar si la cola está vacía
        System.out.println("-> isEmpty() - ¿La fila está vacía?: " + filaTaquilla.isEmpty());
    }
}



