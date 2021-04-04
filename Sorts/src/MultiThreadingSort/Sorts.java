package LAA.MultiThreadingSort;

import java.util.Arrays;
import java.util.Random;
//com Thread
public class Sorts {
    public static int[] criarVetor() {
        int[] numeros = new int[100000];
        Random random = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100000000);
        }
        double number = 3*10^4;
        System.out.println(number);
        //System.out.println(Arrays.toString(numeros));
        return numeros;
    }
    public static void main(String[] args) {
        int[] numeros = criarVetor();
        InsertionSortT is = new InsertionSortT(numeros);
        Thread ist = new Thread(is);
        BubbleSortT bs = new BubbleSortT(numeros);
        Thread bst = new Thread(bs);
        SelectionSortT ss = new SelectionSortT(numeros);
        Thread sst = new Thread(ss);
        CountingSortT cs = new CountingSortT(numeros);
        Thread cst = new Thread(cs);

        ist.start();
        bst.start();
        sst.start();
        cst.start();
    }
}
