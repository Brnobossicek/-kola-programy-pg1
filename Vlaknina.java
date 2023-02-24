public class Vlaknina extends Thread {
    int max;

    public Vlaknina(int max) {
        this.max = max;
    }

    @Override
    public void run() {
        for (int i = 0; i < max; i++) {
            System.out.println(i);
        }
    }
}