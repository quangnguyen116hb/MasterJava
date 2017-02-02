package hackerrank.java.bignumber.java_bigdecimal;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by quang on 02/02/2017.
 */
public class Solution {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String [] s = new String[n+2];

        for(int i = 0; i < n; ++i) {
            s[i] = in.nextLine();
        }

        String [] t = new String[n+2];
        BigDecimal [] a = new BigDecimal[n+2];
        int [] id = new int[n+2];
        for(int i = 0; i < n; ++i) {
            t[i] = s[i];
            a[i] = new BigDecimal(t[i]);
            id[i] = i;
        }

        for(int i = 0; i < n; ++i)
            for(int j =i+1; j < n; ++j)
            {
                int cmp = a[id[i]].compareTo(a[id[j]]);
                if (cmp < 0 || (cmp == 0 && id[i] > id[j]) ) {
                    int tmp = id[i];
                    id[i] = id[j];
                    id[j] = tmp;
                }
            }

        for(int i = 0; i < n; ++i)
            s[i] = t[id[i]];

        for(int i = 0; i < n; ++i)
            System.out.println(s[i]);
    }
}
