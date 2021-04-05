package sorts;

import java.util.Arrays;

public class Sorts {
    //BubbleSort 
    public static int[] bubbleSort(int[] numeros) { 
         int temp = 0;
         for(int i = 0; i < numeros.length; i++){
             for(int j = 1; j < (numeros.length - i);j++){
                 if(numeros[j-1] > numeros[j]){
                     temp = numeros[j-1];
                     numeros[j-1] = numeros[j];
                     numeros[j] = temp;
                 }
             }
         }
         return numeros;
     }
    
    //CountingSort
    public static int[] countingSort(int[] numeros) {
        int min = Arrays.stream(numeros).min().getAsInt();
        int max = Arrays.stream(numeros).max().getAsInt();
        int[] index = new int[max - min + 1];
        int[] places = new int[numeros.length];

        for (int numero : numeros) index[numero - min]++;

        for (int i = 1; i < index.length; i++) index[i] += index[i - 1];

        for (int i = numeros.length - 1; i >= 0; i--) places[index[numeros[i] - min]-- - 1] = numeros[i];
        
        return places;
    }
   
    //InsertionSort
     public static int[] insertionSort(int[] numeros) {
         for (int i = 1; i < numeros.length; i++){ 
            int aux = numeros[i]; 
            int j; 
            for (j = i-1; (j >= 0) && (numeros[j] > aux); j--){ 
                numeros[j+1] = numeros[j];
            }
            numeros[j+1] = aux; 
        } 
        return numeros;
    }
     
     //SelectionSort
     public static int[] selectionSort(int[] numeros) {
        for ( int i = 0; i < numeros.length - 1; i++){
            int min_idx = i;
            for (int j = i+1; j < numeros.length; j++){
                if (numeros[j] < numeros[min_idx]){
                    min_idx = j;  
                }
            }
            int temp = numeros[min_idx];
            numeros[min_idx] = numeros[i];
            numeros[i] = temp;
        }
        return numeros;
    }
}
