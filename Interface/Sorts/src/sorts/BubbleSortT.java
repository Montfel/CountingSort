package sorts;

import java.util.Arrays;

public class BubbleSortT implements Runnable {
    private int[] numeros;

    public BubbleSortT(int[] numeros) {
        this.numeros = numeros;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Começou BubbleSort");
        double inicioContagem = System.nanoTime();
        for (int i = 0; i < (numeros.length - 1) - i; i++) {
            for (int j = 0; j < (numeros.length - 1) - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
            }
        }
        double fimContagem = System.nanoTime();
        System.out.println("BubbleSort Tempo de execução: " + (fimContagem - inicioContagem));
    }
}
