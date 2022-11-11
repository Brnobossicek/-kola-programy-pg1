import java.util.Arrays;

public class Main {

    //static void sort(UmiSePorovnat[] arr) {
        /*
        for (int l = 0; l < arr.length - 1; l++){
            for (int h = l + 1; h < arr.length; h++){
                if (arr[h] < arr[l]){
                    int x = arr[h];
                    arr[h] =  arr[l];
                    arr[l] = x;
                }
            }
        }
    }

         */
        /*
        boolean rozbite = true;
        while (rozbite) {
            rozbite = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i].jsemVetsiNez( arr[i + 1])) { //swap
                    rozbite = true;
                    UmiSePorovnat x = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = x;
                }
            }
        }
    }

         */

    public static void main(String[] args) {
        CeleCislo[] arr = {new CeleCislo(24), new CeleCislo(1), new CeleCislo(30)};
        Arrays.sort(arr);
        for (CeleCislo v : arr) {
            System.out.println(v);
        }
    }
}