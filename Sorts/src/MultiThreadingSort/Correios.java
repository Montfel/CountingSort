package LAA.MultiThreadingSort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Correios implements Runnable{
    public static int x = 0;
    public static int y = 90;

    @Override
    public void run() {
        List<Integer> e2 = new ArrayList<Integer>();
        Random random2 = new Random();
        for (int i = 0; i<= y--; i++) {
            e2.add(++x);
            System.out.println("O entregador 2 pegou o número: " + x);
            try {
                Thread.sleep(500);
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
            i = 0;
        }
        System.out.println("O entregador 2 enviou " + e2.size() + " cartas: ");
        for (Integer integer : e2) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Correios e2 = new Correios();
        Thread e2t = new Thread(e2);
        e2t.start();

        List<Integer> e1 = new ArrayList<Integer>();
        Random random1 = new Random();
        for (int i = 0; i<= y--; i++) {
            e1.add(++x);
            System.out.println("O entregador 1 pegou o número: " + x);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
            i = 0;
        }

        System.out.println("O entregador 1 enviou " + e1.size() + " cartas: ");
        for (Integer integer : e1) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }
}
