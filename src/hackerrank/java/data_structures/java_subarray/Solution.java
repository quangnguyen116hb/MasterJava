package hackerrank.java.data_structures.java_subarray;

import java.util.Scanner;

/**
 * Created by quang on 02/02/2017.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int[] arr = new int [n+2];
        int[] prefix = new int [n+2];
        for(int i = 0; i < n; ++i) {
            arr[i+1] = in.nextInt();
            prefix[i+1] = prefix[i] + arr[i+1];
        }

        int result = 0;
        for(int i = 1; i <= n; ++i)
            for(int j = i; j <= n; ++j)
                if (prefix[j]-prefix[i-1] < 0)
                {
                    //System.out.printf("%d %d%n", i, j);
                    result++;
                }

        System.out.println(result);
        in.close();
    }
}
