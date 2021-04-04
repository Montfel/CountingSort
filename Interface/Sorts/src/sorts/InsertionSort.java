import java.util.Arrays; // importa a biblioteca de vetores

public class InsertionSort { // cria a classe InsertionSort
    public static void main(String[] args) { // cria o método principal (main)
        int[] numeros = {5,4,3,2,1}; // declara o vetor "numeros" do tipo int já preenchido com valores

        System.out.println(Arrays.toString(numeros)); // Exibe no console o vetor não ordenado

        for (int i = 1; i < numeros.length; i++){ // realiza um laço para percorrer o vetor a partir da posição 1
            int aux = numeros[i]; // Salva o valor da posição atual do vetor em uma variável auxiliar
            int j; // declara uma variável para percorrer o for
            for (j = i-1; (j >= 0) && (numeros[j] > aux); j--){ // realiza um laço que percorre o vetor começando da
                // posição i-1 e vai decrescendo enquanto a posiçao for
                // maior que 0 e o valor atual da posição do vetor seja
                // maior que a váriavel auxiliar
                numeros[j+1] = numeros[j]; // Atribui o valor da posição atual do vetor para a posição posterior
            }
            numeros[j+1] = aux; // Atribui o valor da variável auxiliar para a posição anterior do vetor
        }
        System.out.println(Arrays.toString(numeros)); // Exibe no console o vetor ordenado
    }
}
