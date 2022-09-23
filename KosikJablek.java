import java.util.Arrays;
import java.util.Scanner;

public class KosikJablek {
    Scanner sc = new Scanner(System.in);
    int velikost;
    Jablko [] seznam;
    int Pocetjablek;
    int maxpctjab = 8;

    public KosikJablek(int velikost) {
        this.velikost = velikost;
        seznam = new Jablko[velikost];
        this.maxpctjab = maxpctjab;
        this.maxpctjab = maxpctjab;
        if (Pocetjablek > maxpctjab){
            System.out.println("MAX VAHA");
            maxpctjab = Integer.parseInt(sc.nextLine());
        }
    }
    public void pridejJablko(Jablko j) {
        seznam[Pocetjablek] = j;
        Pocetjablek++;

    }
    public void odendejJablko () {
        seznam[Pocetjablek] = null;
        Pocetjablek--;

    }

    @Override
    public String toString() {
        return "KosikJablek{" +
                ", velikost=" + velikost +
                ", seznam=" + Arrays.toString(seznam) +
                ", Pocetjablek=" + Pocetjablek +
                ", maxpctjab=" + maxpctjab +
                '}';
    }
}
