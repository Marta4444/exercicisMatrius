package exercicisMatrius;

import java.util.Arrays;
import java.util.Scanner;

public class exercici3T6Matrius {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int contMajorZero = 0;
        int contMenZero = 0;
        int contIgualZero = 0;
        int i, j;
        System.out.println("Introdueix les files: ");
        int files = entrada.nextInt();
        System.out.println("Introdueix les columnes: ");
        int colum = entrada.nextInt();
        
        int[][] matriu = new int [files][colum];
                
        System.out.println("Introdueix els valors (fila x columna):");
        for (i = 0;i < files; i++){
            for (j = 0;j < colum; j++){
                System.out.println("Valor:");
                matriu[i][j] = entrada.nextInt();
            }
        }
        
        //Arrays.sort(matriu);
        System.out.println(Arrays.deepToString(matriu));
        
        for (i=0;i<files;i++){
            for (j=0;j<colum;j++){
                if (matriu[i][j] > 0){
                    contMajorZero++;
                } else if (matriu[i][j] == 0){
                    contIgualZero++;
                } else {
                    contMenZero++;
                }
            }
        }
        
        System.out.println("Hi ha " + contMajorZero + " valors majors que 0.");
        System.out.println("Hi ha " + contIgualZero + " valors igual a 0.");
        System.out.println("Hi ha " + contMenZero + " valors menors que 0.");
        
        entrada.close();
        
    }
    
}
