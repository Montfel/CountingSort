package LAA.MultiThreadingSort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Entregador implements Runnable{
    private int x;
    private int y;
    private int n;
    private int t;

    public Entregador(int x, int y, int n, int t) {
        this.x = x;
        this.y = y;
        this.n = n;
        this.t = t;
    }
    @Override
    public void run() {
        List<Integer> e = new ArrayList<Integer>();
        Random random2 = new Random();
        for (int i = 0; i<= y--; i++) {
            e.add(++x);
            System.out.println("O entregador " + n + " pegou o número: " + (Thread.currentThread().getId() + x));
            try {
                Thread.sleep(t);
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
            i = 0;
        }
        System.out.println("O entregador " + n + " enviou " + e.size() + " cartas: ");
        for (Integer integer : e) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }
}
