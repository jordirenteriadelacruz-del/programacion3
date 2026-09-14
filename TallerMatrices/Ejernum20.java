package TallerMatrices;

public class Ejernum20 {
    
    public static void main(String[] args) {
        
        int n = 10;
        int m = 10;
      
        int [][] matriz = new int[n][m];

        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if (j >= i) {
                  matriz[i][j] = 0;                     
                
    } else {
        matriz[i][j] = 1;
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