package test;

import logic.HandlingMatriz;

public class Runner {
    public static void main(String[] args)  {
        HandlingMatriz hm = new HandlingMatriz(3,5);
        System.out.println( hm.showMatriz());


        int[][] mat = {{2,3,7,9},{4,1,3,43},{6,9,17,53}};
        HandlingMatriz hm1 = new HandlingMatriz(mat);
        System.out.println(hm1.showMatriz());

        try {
            if( hm.isMagic( ) ){
                System.out.println("MAGICA");
            }else {
                System.out.println("NO ES MAGICA");
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }


        
        
        
        System.out.println("++++++++FIN DEL PROGRAMA++++++++");
        
        
        
        
        
        

       

    }
}
