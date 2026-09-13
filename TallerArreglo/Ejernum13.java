package TallerArreglo;
import java.util.ArrayList;
public class Ejernum13 {
    
    public static void main(String[] args) {
        
        int n = 20;
        int[] a = new int[n];
        int max = 100;
        int min = 1;
      
        


        for(int i = 0; i < a.length; i++){
            a[i] = (int)(Math.random() * (max - min + 1)) + min;
        }

             System.out.println(" Arreglo a ");
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "]=" + a[i]);
        
        }

        double suma = 0;

        for(int i = 0; i < a.length; i++){
            suma += a[i];
      
        }
        double media = suma / a.length;
        System.out.println("\nMedia = " + media);
        
        ArrayList<Integer> mayores = new ArrayList<>();
        ArrayList<Integer> menores = new ArrayList<>();


         for (int i = 0; i <a.length; i++){
            if (a[i] > media) {
                mayores.add(a[i]);
                
            }else if (a[i] < media) {
                menores.add(a[i]);
            }


    }

         System.out.println("\n= Resultado");
         System.out.println("Numeros Mayores (" + mayores.size()+"):"+ mayores);
         System.out.println("Numeros Menores (" + menores.size()+ "): " + menores);


}
}
