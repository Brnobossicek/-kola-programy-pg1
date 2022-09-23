public class Jablko {
    double vahagram;
    String barva;
    String tvar;


    public Jablko(double vaha, String barva, String tvar) {
        this.vahagram = vaha;
        this.barva = barva;
        this.tvar = tvar;
    }

    @Override
    public String toString() {
        return "Jablko{" +
                "vahagram=" + vahagram +
                ", barva='" + barva + '\'' +
                ", tvar='" + tvar + '\'' +
                '}';
    }
}
