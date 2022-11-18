import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList arr = new ArrayList();
        
        for (String jmeno: new File("Z:/").list()) {
            JedenSoubor s = new JedenSoubor(jmeno);
            arr.add(s);
        }
        Collections.sort(arr);
        for (int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i));
        }
        //getAllFiles(f);
    }
    /*
    private static void getAllFiles(File curDir) {
        File[] filesList = curDir.listFiles();
        for(File f : filesList){
            if(f.isDirectory())
                getAllFiles(f);
            if(f.isFile()){
                System.out.println(f.getName());
            }
        }

    }

     */
}