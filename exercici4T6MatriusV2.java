package exercicisMatrius;

import java.util.Arrays;
import java.util.Scanner;

public class exercici4T6MatriusV2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Double notes[][] = new Double[4][5];
        Double suma = 0.0;
        Double mitjana = 0.0;
        int i, j;

        System.out.println("Introdueix les notes dels alumnes: ");

        for (i = 0; i < notes.length; i++) {
            System.out.println("Notes de l'alumne " + (i + 1) + ": ");
            for (j = 0; j < notes[i].length; j++) {
                notes[i][j] = entrada.nextDouble();
            }
        }

        for (i = 0; i < notes.length; i++) {
            Arrays.sort(notes[i]);
            for (j = 0; j < notes[i].length; j++) {
                suma += notes[i][j];
                mitjana = suma / notes[i].length;

            }

            System.out.println("Notes del estudiant " + (i + 1) + ": ");
            System.out.println("Nota minima = " + notes[i][0]);
            System.out.println("Nota maxima = " + notes[i][4]);
            System.out.println("Nota mitjana = " + mitjana);

            suma = 0.0;
            mitjana = 0.0;
        }
        entrada.close();

    }

}
