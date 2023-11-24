package exercicisMatrius;

import java.util.Arrays;

public class exercici2T6Matrius {
    public static void main(String[] args){
        int matriz[][] = new int [10][10];
        
        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz[i].length;j++){
                matriz[i][j] = (i+1)*(j+1); //ficar el +1, si no começa en el 0!
            }
        }
        
        System.out.println(Arrays.deepToString(matriz));
    }
    
}
