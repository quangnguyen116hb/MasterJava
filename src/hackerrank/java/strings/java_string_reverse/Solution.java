package hackerrank.java.strings.java_string_reverse;

/**
 * Created by quang on 01/02/2017.
 */
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        String result = "";
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=reverse(A);
        if (A.equals(B)) result = "Yes";
        else result = "No";
        System.out.println(result);
    }

    public static String reverse(String s) {
        String result = "";
        for(int i = s.length()-1; i >= 0; --i)
            result += s.charAt(i);
        return result;
    }

}
