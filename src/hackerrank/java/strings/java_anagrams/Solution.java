package hackerrank.java.strings.java_anagrams;

/**
 * Created by quang on 01/02/2017.
 */
import java.util.*;

public class Solution {
    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        char[] tmp = a.toCharArray();
        Arrays.sort(tmp);
        a = String.valueOf(tmp);
        tmp = b.toCharArray();
        Arrays.sort(tmp);
        b = String.valueOf(tmp);
        boolean result = a.equals(b);
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

