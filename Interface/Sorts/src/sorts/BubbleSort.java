import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) { // cria o método principal (main)
        int[] numeros = {5, 4, 3, 2, 1}; // declara o vetor "numeros" do tipo int já preenchido com valores
        System.out.println(Arrays.toString(numeros)); // Exibe no console o vetor não ordenado
        System.out.println(Arrays.toString(bubbleSort(numeros))); // Exibe no console o vetor ordenado
    }
    public static int[] bubbleSort(int[] numeros) { // método criado para ordenar o vetor
        for (int i = 0; i < (numeros.length - 1) - i; i++) { // laço criado para percorrer o vetor com a quantidade de
            // vezes que vai reiniciar a troca
            for (int j = 0; j < (numeros.length - 1) - i; j++) { //laço para realizar as trocas do número pelo posterior
                if (numeros[j] > numeros[j + 1]) { // verifica se o número atual é maior que número posterior do vetor
                    int aux = numeros[j]; // salva em uma variável auxiliar o número da posição atual
                    numeros[j] = numeros[j + 1]; // salva o número da posição posterior na posição do número atual
                    numeros[j + 1] = aux; // salva o número da posição atual na posição posterior
                }
            }
        }
        return numeros; // retorna o vetor numeros
    }

}
