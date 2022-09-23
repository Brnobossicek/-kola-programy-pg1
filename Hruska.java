public class Hruska {
    double vahagram;
    String barva;
    String tvar;

    public Hruska(double v, String zelená, String normal) {
        this.vahagram = vahagram;
        this.barva = barva;
        this.tvar = tvar;
    }

    @Override
    public String toString() {
        return "Hruska{" +
                "vahagram=" + vahagram +
                ", barva='" + barva + '\'' +
                ", tvar='" + tvar + '\'' +
                '}';
    }
}
