import java.util.Arrays;
import java.util.Scanner;

public class CountingSort2 {
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

        for (int numero : numeros) index[numero - min]++;

        int k = 0;
        for (int i = 0; i < index.length; i++)
            while (index[i] > 0) {
                numeros[k++] = i + min;
                index[i]--;
            }

        double fimContagem = System.nanoTime();
        return new Object[] {numeros, (fimContagem - inicioContagem)};
    }
}
