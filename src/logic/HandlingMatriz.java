package logic;


import java.util.Arrays;

import java.util.Random;

/**
 * Clase que gestiona una matriz de valores numéricos
 */
public class HandlingMatriz {
    //Arreglo bidimensional
    private int[][] matriz;

    public HandlingMatriz(int rows, int cols ) {
        matriz = new int[ rows][cols];
        loadValues();
    }

    public HandlingMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

    /**
     * Método que genera los valores para la matriz
     */
    public void loadValues(){
        for( int i = 0 ; i < matriz.length ; i++ ){
            for( int j = 0 ; j < matriz[i].length ; j++ ){
                matriz[i][j] = new Random().nextInt(99) + 1;
            }
        }
    }

    /**
     * Método que retorna un String con los elementos de la matriz en forma matricial
     * @return String
     */
    public String showMatriz(){
        StringBuilder sb = new StringBuilder();

        for( int i = 0 ; i < matriz.length ; i++ ){
            for( int j = 0 ; j < matriz[i].length ; j++ ){
                sb.append( matriz[i][j] + "\t");
            }
            sb.append("\n");
        }

        return sb.toString();
    }

    /**
     * Método que valida si la matriz es mágica
     * @return true si es mágica, false si no es mágica
     * @throws Exception Lanza la excepción cuando no se puede validar (rows != cols)
     * Responsable ACERO MORALES SERGIO SANTIAGO
     */
    public boolean isMagic()throws Exception{

        if( matriz.length == matriz[0].length ){
            //TODO Validar matriz

            return false;

        }else{
            throw new Exception("No se puede Validar");
        }
    }

    /**
     * Método que calcula la suma de una fila
     * @param row El número de fila a sumar
     * @return la suma de los elementos de la fila
     * @throws Exception cuando el número de fila no es válido
     * Responsable: CARO SANCHEZ CESAR RICARDO
     */

    public int sumRow(int row) throws Exception {
    if (row < 0 || row >= matriz.length) {
        throw new Exception("Invalid row number");
    }
    int sum = 0;
    for (int j = 0; j < matriz[row].length; j++) {
        sum += matriz[row][j];
    }
    return sum;
}

    /**
     * Método que calcula la suma de una COLUMNA
     * @param col El número de columna a sumar
     * @return la suma de los elementos de la columna
     * @throws Exception cuando el número de columna no es válido
     * Responsable: CUJABAN CORREDOR HERMAN ALEJANDRO
     */
    public int sumCol ( int col ) throws Exception{
        //TODO implementar el método
        if( col >= 0 || col < matriz[0].length ){
            //TODO Sumar columna

            return 0;
        }

        throw new Exception("Columna fuera de Rango");
    }

    /**
     * Método que retorna los elementos de la diagonal principal
     * @return arreglo de enteros con los elementos de la diagonal principal
     * Responsable: FIGUEREDO MOLANO MARIA CAMILA
     */
    public int[ ] getMainDiag(){

        return null;
    }

    /**
     * Método que retorna los elementos de la diagonal secundaria
     * @return arreglo de enteros con los elementos de la diagonal secundaria
     * Responsable: GALÁN ECHEVERRI JUAN ESTEBAN
     */
    public int[ ] getSecDiag(){

        return null;
    }

    /**
     * Método que calcula la multiplicación de dos matrices
     * @param mat segunda matriz
     * @return matriz con los elementos de la multiplicación, o null si no se puede
     * Responsable: GONZALEZ MERCHAN JAHYR
     */
    public int[][] multMatriz( int[][] mat ){

        return null;
    }

    /**
     * Método que calcula la transpuesta de la matriz
     * @return matriz con los elementos de la trasnpuesta
     * Responsable: HERNANDEZ BOTÍA GERMÁN CAMILO
     */
    public int[][] getTranspuesta(){

        int [][] matTrans = new int[matriz[0].length][matriz.length];

        for( int i = 0 ; i < matriz.length ; i++ ){
            for( int j = 0 ; j < matriz[0].length ; j++ ){
                matTrans[j][i] = matriz[i][j];
            }
        }

        return matTrans;
    }

    /**
     * Método que calcula la suma de dos matrices
     * @param mat la segunda matriz
     * @return una matriz con los elementos de la suma
     * Responsable: LADINO FERNANDEZ LINA XIOMARA
     */
    public int[][] sumMatriz(int[][] mat){

        return null;
    }

    /**
     * Método que calcula la inversa de la matriz
     * @return matriz con los elementos de la inversa
     * Responsable: MESA ACEVEDO JULIÁN FELIPE
     */
    public int[][] invertMatriz(){

        return null;
    }

    public int[][] getMatriz() {
        return matriz.clone();
    }

    public void generateMagic(int size ){

        if( size % 2 == 0 ){
            matriz = magicPair( size );
        }else{
            matriz = magicOdd( size );
        }


    }

    /**
     * Método que genera una matriz mágica de orden impar
     * @return elementos de la matriz mágica

     * Responsable: MONGUI TORRES ANDRES FELIPE
     */
    private int[][] magicOdd(int size) {
    	
    	int[][] matrizood = new int[size][size];
    	
    	
    	int numbervalue=1;
    	int i=0,j=size/2;
    	
    	while(numbervalue<=size*size)	{
    		 matrizood[i][j]=numbervalue;
    		 int cambioi=i-1;
    		 int cambioj=j+1;
    		 
    		 if(cambioi<0)	{
    			 cambioi=matrizood.length-1;
    		 }
    		 if(cambioj>=size)	{
    			 cambioj=0;
    		 }
    		 if(matrizood[cambioi][cambioj]!=0)	{
    			 i=i+1;
    			 if (i >= size) {
    	                i = 0;
    	            }
    	        } else {
    	            i = cambioi;
    	            j = cambioj;
    	        }
    		 
    		 numbervalue++;
    	}
    	
    	/*
    	 StringBuilder magicood = new StringBuilder();
    	 
    	 for( i = 0 ; i < matrizood.length ; i++ ){
             for( j = 0 ; j < matrizood[i].length ; j++ ){
                 magicood.append( matrizood[i][j] + "\t");
             }
             magicood.append("\n");
         }
*/
       
    	
        return matrizood;
    }

    /**
     * Método que genera una matriz mágica de orden par
     * @return elementos de la matriz mágica
     * Responsable: NAUSA ACOSTA LUIS ALEJANDRO
     */
    private int[][] magicPair( int size ) {

        return null;
    }

    /**
     * Método que retorna los elementos que se encuentran por debajo de la diagonal principal
     * @return Un vector con los elementos
     * @throws Exception Se lanza cuando no es una matriz cuadrada (n x n)
     * Responsable: PATINO ZAMBRANO BRAYAN ESNEIDER
     */
    public int[] getElementsBelow() throws Exception{

        return null;

    }

    /**
     * Método que retorna los elementos que se encuentran sobre la diagonal principal
     * @return vector con los elementos
     * @throws Exception Se lanza cuando no es una matriz cuadrada (n x n)
     * Responsable: PÉREZ CASTAÑEDA ANDRÉS DAVID
     */
    public int[] getElementsOver( ) throws Exception{

        return null;
    }


    /**
     * Método que vertifica si una matriz es triangular superior.
     * @return verdadero si es triangular o falso si no es
     * @throws Exception Se lanza cuando no es una matriz cuadrada (n x n)
     * Responsable: RICAURTE GARCÍA EIMY XIOMARA
     * Una matriz es triangular cuando todas las entradas bajo la diagonal principal son iguales a cero
     */
    public boolean isTriangular()throws Exception{

        return false;
    }

    /**
     * Método que verifica si una matriz es diagonal
     * @return true si la matriz es diagonal, o false si no es
     * @throws Exception Se lanza cuando no es una matriz cuadrada (n x n)
     * Responsable: SÁNCHEZ JAIME CAMILO ANDRÉS
     * Una matriz cuadrada es diagonal si todos los elementos no diagonales son ceros
     */
    public boolean isDiagonal()throws Exception{

        return false;

    }


}
