package Ejercicios9;
import java.util.Stack;
import java.util.Scanner;

public class Ejercicio9_4_9_5 {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int n = 5; 
        Stack<Integer>[] pilas = new Stack[n + 1];
        
        for (int i = 1; i <= n; i++) {
            pilas[i] = new Stack<>();
        }
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los datos en formato triplo (i j k). Ingrese i = 0 para terminar:");
        
        while (true) {
            System.out.print("Ingrese i (pila), j (elemento), k (operación -1, 0, 1): ");
            int i = scanner.nextInt();
            if (i == 0) break;
            
            int j = scanner.nextInt();
            int k = scanner.nextInt();
            
            if (k == -1) {
                pilas[Math.abs(i)].clear();
                System.out.println("Pila P" + Math.abs(i) + " vaciada.");
            } else {
                if (i > 0) {
                    pilas[i].push(j);
                    System.out.println("Insertado " + j + " en P" + i);
                } else if (i < 0) {
                    int idx = Math.abs(i);
                    if (!pilas[idx].isEmpty()) {
                        pilas[idx].pop();
                        System.out.println("Elemento eliminado de P" + idx);
                    } else {
                        System.out.println("La pila P" + idx + " está vacía.");
                    }
                }
            }
        }
        scanner.close();

        System.out.println("\n--- CONTENIDO FINAL DE LAS PILAS ---");
        for (int i = 1; i <= n; i++) {
            System.out.println("Pila P" + i + ": " + pilas[i]);
        }
    }
}