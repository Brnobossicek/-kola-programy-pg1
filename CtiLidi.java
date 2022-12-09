import java.io.*;

public class CtiLidi {
    public static void main (String[]args) throws IOException, ClassNotFoundException {

        FileInputStream inFile = new FileInputStream("z:/test.dat");
        ObjectInputStream objIn = new ObjectInputStream(inFile);
        Object obj = objIn.readObject();
        System.out.println(obj);
    }
}
