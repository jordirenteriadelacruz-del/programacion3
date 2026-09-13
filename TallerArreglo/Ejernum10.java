package TallerArreglo;

public class Ejernum10 {
    public static void main(String[] args) {
        
        int n = 7;
        int [] a = new int[n];
        int max = 10;
        int min = 1;
      
        for(int i = 0; i < a.length; i++){
            a[i] = (int)(Math.random() * (max - min + 1)) + min;
        }

        System.out.println(" Arreglo a ");
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "]=" + a[i]);


    }
    int tamab = (n + 1)/2;
    int [] b = new int [tamab];

    for (int i = 0; i < b.length; i++) {
        int opuesto = n - 1 - i;
        if (i == opuesto) {
            b[i] = a[i];
            }else{
                b[i] = a[i] + a[opuesto];
            }

           
        }
        System.out.println("\n arreglo b");
          for(int i = 0; i < b.length; i++){
            System.out.println("b[" + i + "]=" + b[i]);
        }

}
}