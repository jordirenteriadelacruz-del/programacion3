package TallerArreglo;
import java.util.Scanner;

public class Ejernum9 {
    public static void main(String[] args) {

        int[] numeros = new int[20];
        int max = 10;
        int min = 1;

  
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = (int)(Math.random() * (max - min + 1)) + min;
        }

  
        System.out.println("=== ARREGLO ===");
        for(int i = 0; i < numeros.length; i++){
            System.out.println("numeros[" + i + "]=" + numeros[i]);
        }

      
        Scanner sc = new Scanner(System.in);
        System.out.print("\nIngrese el numero a buscar: ");
        int x = sc.nextInt();

   
        int contador = 0;
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] == x){
                contador++;
            }
        }

       
        System.out.println("\n RESULTADO ");
        System.out.println("El numero " + x + " aparece " + contador + " veces en el arreglo.");

        sc.close();
    }
}