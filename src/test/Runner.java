package test;

import logic.HandlingMatriz;
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


        
        
        
        System.out.println("++++++++FIN DEL PROGRAMA++++++++");
        
        
        
        
        
        

       

    }
}
