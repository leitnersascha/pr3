package at.campus02.pr3.threads.example3.positiv;

public class Demo {

    public static void main(String[] args) {
        Konto k1 = new Konto(100);
        Konto k2 = new Konto(200);

        Runnable w1 = new Worker('A', k1, k2);
        Runnable w2 = new Worker('B', k2, k1);

        // w1 -> 0, 300
        // w2  -> 200, 100
        // total: 200,


        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w2);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println(k1.getWert());
        System.out.println(k2.getWert());
    }

}
