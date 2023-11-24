package exercicisMatrius;
import java.util.Arrays;

public class exercici1T6Matrius {
    public static void main(String[] args){
        int matr[][] = new int[5][5];
    int cont = 1;

    for (int i=0;i<matr.length;i++){
        for (int j=0;j<matr[i].length;j++){
            matr[i][j] = cont;
            cont++;
        }
    }

    for (int i=0;i<matr.length;i++){
        for (int j=0;j<matr[i].length;j++){
            System.out.println(matr[i][j]);
        }
    }
    
    //se usa "Arrays.deepToString(matriz)" per a imprimir matrius. El "Arrays.toString" no es suficient.
    System.out.println(Arrays.deepToString(matr)); 
    }
    
}