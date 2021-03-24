package LAA;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] numeros = {5, 4, 1, 6, 8, 3, 15, -30, 1002};
        System.out.println(Arrays.toString(Ordenar(numeros)));
    }
    static int[] Ordenar(int[] numeros) {
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
        return numeros;
    }
}
