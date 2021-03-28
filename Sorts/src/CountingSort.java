import java.util.Arrays;
import java.util.Scanner;

public class CountingSort {
    public static void main(String[] args) {
        int[] numeros = new int[7];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString((int[]) Ordenar(numeros)[0]));
        System.out.println("Tempo de execução: " + Ordenar(numeros)[1] + " nanosegundos");
    }

    public static Object[] Ordenar(int[] numeros) {
        double inicioContagem = System.nanoTime();
        int min = Arrays.stream(numeros).min().getAsInt();
        int max = Arrays.stream(numeros).max().getAsInt();
        int[] index = new int[max - min + 1];
        int[] places = new int[numeros.length];

        for (int numero : numeros) index[numero - min]++;

        for (int i = 1; i < index.length; i++) index[i] += index[i - 1];

        for (int i = numeros.length - 1; i >= 0; i--) places[index[numeros[i] - min]-- - 1] = numeros[i];

        double fimContagem = System.nanoTime();
        return new Object[] {places, (fimContagem - inicioContagem)};
    }
}
