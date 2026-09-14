package TallerMatrices;

public class Ejernum17 {

    public static void main(String[] args) {

           
        int[][] m = {{5, 8, 6},
                     {1, 3, 2},
                     {4, 9, 7}};

        int filas = m.length;
        int columnas = m[0].length;

        
        System.out.println("=== MATRIZ ===");
        String cad = "";
        for(int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
                cad += "|" + m[i][j];
            }
            cad += "| \n";
        }
        System.out.println(cad);

        
        int[] sumaFilas = new int[filas];
        int[] sumaColumnas = new int[columnas];

        
        for(int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
                sumaFilas[i] += m[i][j];       
                sumaColumnas[j] += m[i][j];   
            }
        }

       
        System.out.println("= Suma de filas =");
        for(int i = 0; i < filas; i++){
            System.out.println("Fila " + i + ": " + sumaFilas[i]);
        }

        System.out.println("\n= Suma de columnas =");
        for(int j = 0; j < columnas; j++){
            System.out.println("Columna " + j + ": " + sumaColumnas[j]);
        }
    }
}


    
    

