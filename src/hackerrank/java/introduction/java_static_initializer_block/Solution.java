package hackerrank.java.introduction.java_static_initializer_block;

import java.util.Scanner;

/**
 * Created by quang on 01/02/2017.
 */
public class Solution {
    static int B, H;
    static boolean flag = true;

    static {
        Scanner input = new Scanner(System.in);
        B = input.nextInt();
        H = input.nextInt();
        if (B <= 0 || H <= 0) flag = false;
        if (!flag)
            System.out.println("java.lang.Exception: Breadth and height must be positive");
    }

    public static void main(String[] args) {
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
        //System.out.println("\nI should to read more about it");
    }
}
