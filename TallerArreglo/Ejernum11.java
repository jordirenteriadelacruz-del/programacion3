package TallerArreglo;
import java.util.ArrayList;
public class Ejernum11 {

    
    public static void main(String[] args) {

        int n = 20;
        int[] a = new int[n];
        int max = 10;
        int min = -10;

        for(int i = 0; i < a.length; i++){
             a[i] = (int)(Math.random() *  (max - min + 1)) + min;
            
            }
            System.out.println(" Arreglo a ");
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "]=" + a[i]);


    }


    ArrayList<Integer> negativos = new ArrayList<>();
         ArrayList<Integer> positivos = new ArrayList<>();
         ArrayList<Integer> cero = new ArrayList<>();

        for (int i = 0; i <a.length; i++){
            if (a[i] < 0) {
                negativos.add(a[i]);
                
            }else if (a[i] == 0) {
                cero.add(a[i]);
            }else{
                positivos.add(a[i]);
            }


        
    }

         System.out.println("\n= Resultado");
         System.out.println("Numeros negativos (" + negativos.size()+"):"+ negativos);
         System.out.println("Numeros cero (" + cero.size()+ "): " + cero);
         System.out.println("Numeros positivos (" + positivos.size()+ "): " + positivos);
        

}

}