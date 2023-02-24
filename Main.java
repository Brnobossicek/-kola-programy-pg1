public class Main {
    public static void main(String[] args) throws InterruptedException {

        VelkePole v = new VelkePole();
        Thread t1 = new PoleScitac(v);
        Thread t2 = new PoleScitac(v);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        /*
        Runnable rn = () -> {
            for (int o = 0; o < v.delkaPole(); o++) {
                v.prictiJedna(o);
            }
            System.out.println(v.secti());
        };
        Thread tr = new Thread(rn);
        tr.start();

         */



        /*
        Runnable vlakno = new mojeVlakno1();
        Thread tr = new Thread(vlakno);
        tr.start();

        mojeVlakno1 vlakno2 = new mojeVlakno1();
        Thread tr1 = new Thread(vlakno2);
        tr1.start();

        Runnable rn = () -> {
            for (int p = 0; p < 100; p++) {
                System.out.println("JOKE");
            }
        };
        Thread tr2 = new Thread(rn);
        tr2.start();


        int max = 3;
        Vlaknina v = new Vlaknina(max);
        Vlaknina1 v1 = new Vlaknina1(max);
        v.start();
        v1.start();
        */

    }
/*
    public static class mojeVlakno1 implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println(i);
            }
        }
    }

 */
}