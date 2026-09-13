package TallerArreglo;

public class Ejernum8 {

    public static void main(String[] args) {

        int[] numeros = new int[30];
        int max = 10;
        int min = 1;
        int contMayor = 0;
        int contMenor = 0;

      
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random() * (max - min + 1)) + min;
        }

       
        System.out.println("= Arreglo =");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numeros[" + i + "]=" + numeros[i]);
        }

       
        int mayor = numeros[0];
        int menor = numeros[0];

   
        for (int i = 1; i < numeros.length; i++) {
            if(numeros[i] > mayor){
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

     
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] == mayor){
                contMayor++;
            }
            if(numeros[i] == menor){
                contMenor++;
            }
        }

        
        System.out.println("\n RESULTADOS ");
        System.out.println("Numero mayor: " + mayor);
        System.out.println("Veces que se repite el mayor: " + contMayor);
        System.out.println("Numero menor: " + menor);
        System.out.println("Veces que se repite el menor: " + contMenor);
    }
}
