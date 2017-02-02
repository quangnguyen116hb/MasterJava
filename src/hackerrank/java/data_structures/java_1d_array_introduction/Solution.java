package hackerrank.java.data_structures.java_1d_array_introduction;

/**
 * Created by quang on 02/02/2017.
 */
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        // Declare array a here
        int [] a = new int[n];
        for(int i = 0 ; i < n; i++){
            int val = scan.nextInt();
            a[i] = val;
        }
        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
