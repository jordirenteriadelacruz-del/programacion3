package TallerArreglo;

import java.util.ArrayList;

public class Ejernum7 {
    public static void main(String[] args) {

        int[] a = new int[10];
        int max = 100;
        int min = 1;

        for(int i = 0; i < a.length; i++){
             a[i] = (int)(Math.random() *  (max - min + 1)) + min;
            
            }

   for(int i = 0; i < a.length; i++){
            System.out.println("a[" + i + "]=" + a[i]);
        }

        ArrayList<Integer> pares = new ArrayList<>();
         ArrayList<Integer> impares = new ArrayList<>();

         for (int i = 0; i <a.length; i++){
            if (a[i] % 2 ==0) {
                pares.add(a[i]);
                
            }else{
                impares.add(a[i]);
            }

         }
         System.out.println("\n= Resultado");
         System.out.println("Numeros pares (" + pares.size()+"):"+ pares);
         System.out.println("Numeros impares (" + impares.size()+ "): " + impares);

         

      
}
    
}