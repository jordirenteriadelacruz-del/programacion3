package TallerMatrices;

public class Ejernum22 {
    
    public static void main(String[] args) {
        
        
        int filas = 3;
        int columnas = 4;
        int[][] m = new int[filas][columnas];

        int max = 100;
        int min = 1;

      
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = (int)(Math.random() * (max - min + 1)) + min;
            }
        }

        
        int mayor = m[0][0];
        int filaMayor = 0, colMayor = 0;

        int menor = m[0][0];
        int filaMenor = 0, colMenor = 0;

      
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (m[i][j] > mayor) {
                    mayor = m[i][j];
                    filaMayor = i;
                    colMayor = j;
                }
                if (m[i][j] < menor) {
                    menor = m[i][j];
                    filaMenor = i;
                    colMenor = j;
                }
            }
        }

        
        String cad = "Matriz Generada:\n";
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                cad += "|" + m[i][j];
            }
            cad += "|\n";
        }
        System.out.println(cad);

       
        System.out.println("Mayor elemento: " + mayor + " en la posicion [" + filaMayor + "][" + colMayor + "]");
        System.out.println("Menor elemento: " + menor + " en la posicion [" + filaMenor + "][" + colMenor + "]");
    }
}
