package hackerrank.java.strings.java_substring;

/**
 * Created by quang on 01/02/2017.
 */

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(S.substring(start,end));
    }

}
