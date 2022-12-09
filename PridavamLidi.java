import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class PridavamLidi {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Scanner sc = new Scanner(System.in);
        File file = new File("z:/test.dat");


        FileInputStream inFile = new FileInputStream("z:/test.dat");
        ObjectInputStream objIn = new ObjectInputStream(inFile);
        ArrayList<Clovek> arr = (ArrayList<Clovek>) objIn.readObject();

        while (sc.next() == "NIII") {
            Clovek v = new Clovek(sc.next(), sc.next(), sc.nextInt());
            arr.add(v);
        }


        FileOutputStream outFile = new FileOutputStream(file);
        ObjectOutputStream out = new ObjectOutputStream(outFile);
        for (int i = 0; i < arr.size(); i++) {
            out.writeObject(arr);
        }

        out.close();
        outFile.close();


    }
}
