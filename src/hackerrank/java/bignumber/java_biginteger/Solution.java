package hackerrank.java.bignumber.java_biginteger;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by quang on 02/02/2017.
 */

public class Solution {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
        BigInteger x = new BigInteger(a);
        BigInteger y = new BigInteger(b);
        System.out.println(x.add(y).toString());
        System.out.println(x.multiply(y).toString());
    }
}
