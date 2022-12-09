import java.io.Serializable;

public class Clovek implements Serializable {
    String jmeno;
    String prijmeni;
    int vek;

    public Clovek(String jmeno, String prijmeni, int vek) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
    }

    public String toString() {
        return jmeno + ' ' + prijmeni + ' ' + vek;
    }

}
