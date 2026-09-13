package TallerArreglo;

import java.util.Scanner;
import java.util.ArrayList;

public class Ejernum12 {
    public static void main(String[] args) {
        
        int n = 20;
        int[] a = new int[n];
        int max = 10;
        int min = 1;

        for(int i = 0; i < a.length; i++){
            a[i] = (int)(Math.random() * (max - min + 1)) + min;
        }

             System.out.println(" Arreglo a ");
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "]=" + a[i]);
        
        }


         
        Scanner sc = new Scanner(System.in);
        System.out.print("\nIngrese el numero X a buscar: ");
        int x = sc.nextInt();

        ArrayList<Integer> posiciones = new ArrayList<>();

          for (int i = 0; i <a.length; i++){
            if (a[i] == x) {
                posiciones.add(i + 1);
                
            }

    }

        System.out.println("\n RESULTADO ");    
        System.out.println("El numero " + x + " aparece en las posiciones:" + posiciones  );
        System.out.println("Total de apariciones:" + posiciones.size());
        

}
}
