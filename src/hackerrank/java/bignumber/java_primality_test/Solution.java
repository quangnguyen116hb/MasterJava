package hackerrank.java.bignumber.java_primality_test;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by quang on 02/02/2017.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger p = in.nextBigInteger();
        boolean result = p.isProbablePrime(1000);
        if (result)
            System.out.println("prime");
        else System.out.println("not prime");

        in.close();
    }
}
