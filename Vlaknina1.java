public class Vlaknina1 extends Thread{
    int max;

    public Vlaknina1(int max) {
        this.max = max;
    }

    public void run() {
        for (int p = 0; p < max; p++) {
            System.out.println("A");
        }
    }
}
