import java.io.*;
import java.util.*;

public class welcometojava {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String[] b = new String[(s.length() - k) + 1];

        for (int i = 0; i <= s.length() - k; i++) {
            b[i] = s.substring(i, i + k);
        }
        Arrays.sort(b);
        smallest = b[0];
        largest = b[(s.length() - k)];
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = "welcometojava";
        int k = 3;
        scan.close();
        System.out.println(getSmallestAndLargest(s, k));
    }
}
