package sorts;

import java.util.Arrays;

public class SelectionSortT implements Runnable{
    private int[] numeros;

    public SelectionSortT(int[] numeros) {
        this.numeros = numeros;
    }

    @Override
    public void run(){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Começou SelectionSort");
        double inicioContagem = System.nanoTime();
        for (int i = 0; i < numeros.length; i++) {
            int indiceDoMenorElemento = i;
            for (int j = i; j < numeros.length; j++) {
                if (numeros[indiceDoMenorElemento] > numeros[j]) {
                    indiceDoMenorElemento = j;
                }
            }
            int valorMin = numeros[indiceDoMenorElemento];
            numeros[indiceDoMenorElemento] = numeros[i];
            numeros[i] = valorMin;
        }
        double fimContagem = System.nanoTime();
        System.out.println("SelectionSort Tempo de execução: " + (fimContagem - inicioContagem));
        
    }
}