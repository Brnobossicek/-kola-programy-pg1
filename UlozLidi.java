import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class UlozLidi {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        Clovek c = new Clovek("Kamila", "Mrazova", 36);
        Clovek b = new Clovek("Kamil", "Trmal", 50);
        Clovek a = new Clovek("Kaja", "Tunda", 14);

        ArrayList arr = new ArrayList<>();

        while (sc.hasNext()) {
            Clovek v = new Clovek(sc.next(), sc.next(), sc.nextInt());
            arr.add(v);
        }

        File file = new File("z:/test.dat");
        FileOutputStream outFile = new FileOutputStream(file);
        ObjectOutputStream out = new ObjectOutputStream(outFile);
        out.writeObject(arr);

        out.close();
        outFile.close();
    }
}