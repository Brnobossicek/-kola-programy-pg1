public class PoleScitac extends Thread{
    VelkePole p;

    public PoleScitac(VelkePole p) {
        this.p = p;
    }

    @Override
    public void run() {
        for (int i = 0; i < p.delkaPole(); i++) {
            p.prictiJedna(i);
        }
        System.out.println(p.secti());
    }
}
