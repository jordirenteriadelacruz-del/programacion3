package TallerMatrices;

public class Ejernum19 {
    
    public static void main(String[] args) {
        
        
        int n = 3;
        int m = 3;
      
        int[][] matriz = new int[n][m];
        

       
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if (i == j) {
                  matriz[i][j] = 1;                     
                }else{
                    matriz[i][j] = 0;
                }

            }
          
        }
        System.out.println("= Matriz =" + n + "x" + m + "===");
        String cad = "";
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                cad += "|" + matriz[i][j] + "\t";
            }
            cad += "\n";
        }

        System.out.println(cad);


    }
}
