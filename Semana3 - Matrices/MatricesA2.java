public class MatricesA2 {
    public static void main(String[] args) {
        
        //Declaracion de una matriz 3x3 (forma 1)
        int[][] m = {{5, 8, 6},
                     {1, 3, 2},  
                     {4, 9, 7}};  
        //Recorrer la matriz
        for (int i = 0; i <m.length; i++){
        for (int j = 0; i < m[0].length; j++){
            System.out.println("m["+i+"]["+j+"]= "+m[i][j]); 
        }
    }


    }
}
