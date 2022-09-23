public class Farma {
    public static void main(String[] args) {


        Jablko j1 = new Jablko(156.2, "Zelena", "Normal");
        Jablko j2 = new Jablko(156.2, "Zelena", "Normal");
        Jablko j3 = new Jablko(156.2, "Zelena", "Normal");

        System.out.println(j1);
        System.out.println(j1.toString());
        System.out.println(j2);

        Hruska h1 = new Hruska(156.2, "Zelená", "Normal");
        Hruska h2 = new Hruska(156.2, "Zelená", "Normal");

        KosikJablek k = new KosikJablek(8);
        k.pridejJablko(j1);
        k.pridejJablko(j2);
        k.pridejJablko(j3);

        k.odendejJablko();

        System.out.println(k.toString());

    }
}