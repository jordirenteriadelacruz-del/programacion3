package Ejercicios9;

import java.util.Queue;
import java.util.LinkedList;

class Repartidor {
    String seguridadSocial;
    String entidadPropaganda;
    Repartidor siguiente;

    public Repartidor(String ss, String entidad) {
        this.seguridadSocial = ss;
        this.entidadPropaganda = entidad;
        this.siguiente = null;
    }
}

public class Ejercicio10_5 {
    public static void main(String[] args) {
        Queue<Repartidor> colaTrabajoDiario = new LinkedList<>();
        
        colaTrabajoDiario.offer(new Repartidor("SS-10029", "Campaña A"));
        colaTrabajoDiario.offer(new Repartidor("SS-88392", "Campaña B"));

        Repartidor cabezaListaPrincipal = new Repartidor("SS-00001", "Campaña Base");

        while (!colaTrabajoDiario.isEmpty()) {
            Repartidor nuevoRegistro = colaTrabajoDiario.poll();
            
            Repartidor actual = cabezaListaPrincipal;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoRegistro;
            System.out.println("Actualizado en lista: Repartidor " + nuevoRegistro.seguridadSocial);
        }
    }
}
