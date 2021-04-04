package LAA.MultiThreadingSort;

import java.util.Arrays;

public class InsertionSortT implements Runnable{
    private int[] numeros;

    public InsertionSortT(int[] numeros) {
        this.numeros = numeros;
    }

    @Override
    public void run(){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Começou InsertionSort");
        double inicioContagem = System.nanoTime();
        for (int i = 1; i < numeros.length; i++) {
            int aux = numeros[i];
            int j;
            for (j = i-1; (j >= 0) && (numeros[j] > aux); j--){
                numeros[j+1] = numeros[j];
            }
            numeros[j+1] = aux;
        }
        double fimContagem = System.nanoTime();
        System.out.println("InsertionSort Tempo de execução: " + (fimContagem - inicioContagem));
    }
}
