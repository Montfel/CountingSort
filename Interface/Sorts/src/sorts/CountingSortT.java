package sorts;

import java.util.Arrays;

public class CountingSortT implements Runnable {
    private int[] numeros;

    public CountingSortT(int[] numeros) {
        this.numeros = numeros;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Começou CountingSort");
        double inicioContagem = System.nanoTime();
        int min = Arrays.stream(numeros).min().getAsInt();
        int max = Arrays.stream(numeros).max().getAsInt();
        int[] index = new int[max - min + 1];
        int[] places = new int[numeros.length];

        for (int numero : numeros) index[numero - min]++;

        for (int i = 1; i < index.length; i++) index[i] += index[i - 1];

        for (int i = numeros.length - 1; i >= 0; i--) places[index[numeros[i] - min]-- - 1] = numeros[i];

        double fimContagem = System.nanoTime();
        System.out.println("CountingSort Tempo de execução: " + (fimContagem - inicioContagem));
    }
}
