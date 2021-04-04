package sorts;

import java.util.ArrayList;
import java.util.Arrays;

public class Sorts {
    //BubbleSort 
     public static ArrayList<Integer> bubbleSort(ArrayList<Integer> numeros) { 
         int n = numeros.size();
         int temp = 0;
         for(int i = 0; i < n; i++){
             for(int j = 1; j < (n-i);j++){
                 if(numeros.get(j-1) > numeros.get(j)){
                     temp = numeros.get(j-1);
                     numeros.set(j-1,numeros.get(j));
                     numeros.set(j, temp);
                 }
             }
         }
         return numeros;
     }
         
    //CoutingSort
    
   public static ArrayList<Integer> coutingSort(ArrayList<Integer> numeros) {
        int min = numeros.get(0);
        int max = numeros.get(0);
        for(Integer numero : numeros){
            if (numero < min){
                min = numero;
            }
            if (numero > max){
                max = numero;
            }
        }
        int[] index = new int[max - min + 1];

        for (int numero : numeros) index[numero - min]++;

        int k = 0;
        for (int i = 0; i < index.length; i++)
            while (index[i] > 0) {
                numeros.set(k++,i+min);
                index[i]--;
            }

        return numeros;
    }
   
    //InsertionSort
     public static ArrayList<Integer>  insertionSort(ArrayList<Integer> numeros) {
         for (int i = 1; i < numeros.size(); i++){ 
            int aux = numeros.get(i); 
            int j; 
            for (j = i-1; (j >= 0) && (numeros.get(j) > aux); j--){ 
                numeros.set(j+1,numeros.get(j));
            }
            numeros.set(j+1,aux); 
        } 
        return numeros;
    }
     
     //SelectionSort
     public static ArrayList<Integer> selectionSort(ArrayList<Integer> numeros) {
        int n = numeros.size();
        for ( int i = 0; i < n-1; i++){
            int min_idx = i;
            for (int j = i+1; j < n; j++){
                if (numeros.get(j) < numeros.get(min_idx)){
                    min_idx = j;  
                }
            }
            int temp = numeros.get(min_idx);
            numeros.set(min_idx,numeros.get(i));
            numeros.set(i,temp);
        }
        
        
        return numeros;
    }
     
     
}
