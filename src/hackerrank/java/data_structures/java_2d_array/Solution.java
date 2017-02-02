package hackerrank.java.data_structures.java_2d_array;

/**
 * Created by quang on 02/02/2017.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }

        int result = Integer.MIN_VALUE;
        for(int i = 1; i+1 < 6; ++i)
            for(int j = 1; j+1 < 6; ++j)
            {
                int sum = arr[i][j] + arr[i-1][j-1] + arr[i-1][j] + arr[i-1][j+1] + arr[i+1][j-1]
                        + arr[i+1][j] + arr[i+1][j+1];
                result = Integer.max(result, sum);
            }

        System.out.println(result);
    }
}
