package test;

import logic.HandlingMatriz;

import java.util.Arrays;
import java.util.Scanner;  // Asegúrate de importar la clase Scanner

public class Runner {
    public static void main(String[] args) {
        HandlingMatriz hm = new HandlingMatriz(3, 5);
        System.out.println(hm.showMatriz());

        int[][] mat = {{2, 3, 7, 9}, {4, 1, 3, 43}, {6, 9, 17, 53}};
        HandlingMatriz hm1 = new HandlingMatriz(mat);
        System.out.println(hm1.showMatriz());

        Scanner scanner = new Scanner(System.in);  

        try {
            System.out.print("Enter the row number for hm: ");
            int rowToSumHm = scanner.nextInt();
            int sumHm = hm.sumRow(rowToSumHm);
            System.out.println("Sum of row " + rowToSumHm + " in hm: " + sumHm);

            System.out.print("Enter the row number for hm1: ");
            int rowToSumHm1 = scanner.nextInt();
            int sumHm1 = hm1.sumRow(rowToSumHm1);
            System.out.println("Sum of row " + rowToSumHm1 + " in hm1: " + sumHm1);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }

        try {
            if (hm.isMagic()) {
                System.out.println("MAGICA");
            } else {
                System.out.println("NO ES MAGICA");
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }

        hm.generateMagic( 3 );

        System.out.println("+++++++++++MATRIZ MAGICA IMPAR+++++++++++");
        System.out.println( hm.showMatriz());

        try {
            if( hm.isMagic( ) ){
                System.out.println("La Matriz es Mágica");
            }else{
                System.out.println("La Matriz no es Mággica");
            }



            System.out.println("++++++++SUMA DE FILAS++++++++++");
            System.out.println( hm.showMatriz( ) );

            for( int i = 0 ; i < hm.getMatriz().length ; i++ ){
                System.out.printf("Fila[%d]=%d\n",i,hm.sumRow(i));
            }

            System.out.println("++++++++SUMA DE COLUMNAS++++++++++");

            for( int j = 0 ; j < hm.getMatriz()[0].length ; j++ ){
                System.out.printf("Columna[%d]=%d\n",j,hm.sumCol(j));
                System.out.println("j vale " + j );
            }

            System.out.println("Diagonal Principal " + Arrays.toString( hm.getMainDiag()));
            System.out.println("Diagonal Secundaris " + Arrays.toString( hm.getSecDiag()));

            System.out.println("+++++TRANSPUESTA DE LA MATRIZ+++++++");
            System.out.println("Original");
            System.out.println(hm1.showMatriz());
            HandlingMatriz handTrans = new HandlingMatriz( hm1.getTranspuesta( ) );
            System.out.println( handTrans.showMatriz( ) );

            System.out.println("++++++++++++++++MULTIPLICACION DE MATRICES+++++++++++++");
            System.out.println( "++Matriz Uno++" );
            System.out.println( hm.showMatriz());

            System.out.println( "++Matriz Dos++" );
            System.out.println( hm1.showMatriz());

            System.out.println("++++Resultado+++++");

            HandlingMatriz hmMult = new HandlingMatriz( hm.multMatriz( hm1.getMatriz()));

            System.out.println( hmMult.showMatriz());




        } catch (Exception e) {
            e.printStackTrace();
        }


        System.out.println("++++++++FIN DEL PROGRAMA++++++++");


    }
}
