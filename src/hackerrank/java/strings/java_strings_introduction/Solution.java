package hackerrank.java.strings.java_strings_introduction;

/**
 * Created by quang on 01/02/2017.
 */
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length());
        boolean flag = A.compareTo(B) > 0;
        String result = "";
        if (flag) result = "Yes"; else result = "No";
        System.out.println(result);
        result = A.substring(0,1).toUpperCase() + A.substring(1) + " " + B.substring(0,1).toUpperCase() + B.substring(1);
        System.out.println(result);
    }

}
