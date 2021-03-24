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

        int max = Arrays.stream(numeros).max().getAsInt();
        int[] index = new int[max + 1];
        for (int numero : numeros) {
            index[numero]++;
        }

        int soma = 0;
        for (int i = 0; i < index.length; i++) {
            soma += index[i];
            index[i] = soma;
        }

        int[] places = new int[numeros.length];
        for (int numero : numeros) {
            places[index[numero] - 1] = numero;
            index[numero]--;
        }
        System.out.println(Arrays.toString(places));
    }
}
