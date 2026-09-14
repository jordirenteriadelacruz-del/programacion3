package TallerMatrices;
public class Ejernum21 {
    public static void main(String[] args) {
   
        int filas = 4;
        int columnas = 4;
        int[][] m = new int[filas][columnas];
        int[] b = new int[filas];

        int max = 50;
        int min = 1;

       
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = (int)(Math.random() * (max - min + 1)) + min;
            }
        }

        
        for (int i = 0; i < m.length; i++) {
            int sumaPares = 0;
            for (int j = 0; j < m[0].length; j++) {
                if (m[i][j] % 2 == 0) {
                    sumaPares += m[i][j];
                }
            }
            b[i] = sumaPares;
        }

     
        String cad = "Matriz M:\n";
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                cad += "|" + m[i][j];
            }
            cad += "|\n";
        }
        System.out.println(cad);

       
        System.out.println("Vector B (Suma de números pares por fila):");
        for (int i = 0; i < b.length; i++) {
            System.out.println("b[" + i + "] = " + b[i]);
        }
    }
}