package exercicisMatrius;

import java.util.Scanner;

public class exercici5T6Matrius {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introdueix el numero de persones: ");
        int numPersones = entrada.nextInt();
        Double sous[][] = new Double[numPersones][1];
        int sexe;
        Double sou;
        int i, j;
        Double sumaHomes = 0.0;
        Double mitjanaHomes = 0.0;
        Double sumaDones = 0.0;
        Double mitjanaDones = 0.0; 
        int contHomes = 0;
        int contDones = 0;
        

        for (i=0;i<sous.length;i++){
            System.out.println("Empleat " + (i+1));
            System.out.println("Introdueix el genere:");
            System.out.println("0 = Home");
            System.out.println("1 = Dona");
            sexe = entrada.nextInt();
            
            if (sexe == 0){
                for (j=0;j<sous[i].length;j++){
                
                System.out.println("Introdueix el sou: ");
                sou = entrada.nextDouble();
                sous[i][j] = sou;
                sumaHomes += sou;
                contHomes++;
                }
            } else if (sexe == 1){
                for (j=0;j<sous[i].length;j++){
                
                System.out.println("Introdueix el sou: ");
                sou = entrada.nextDouble();
                sous[i][j] = sou;
                sumaDones += sou;
                contDones++;
                
                }
                
            }
            
        }
        
    
        
        mitjanaHomes = sumaHomes/contHomes;
        mitjanaDones = sumaDones/contDones;
        
        System.out.println("Mitjana de sou de Homes = " + mitjanaHomes);
        System.out.println("Mitjana de sou de Dones = " + mitjanaDones);
        
        entrada.close();
        
    }

}
