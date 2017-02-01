package hackerrank.java.strings.java_string_compare;

/**
 * Created by quang on 01/02/2017.
 */
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int k = input.nextInt();
        int N = s.length()-k+1;
        String [] arr = new String[N];
        for(int i = 0; i < N; ++i) {
            arr[i] = s.substring(i,i+k);
        }
        System.out.println(getMinString(arr));
        System.out.println(getMaxString(arr));
    }

    public static String getMinString(String[] arr)
    {
        if (arr==null) return "";
        String result = arr[0];
        for(int i = 1; i < arr.length; ++i)
            if (arr[i].compareTo(result) < 0) result = arr[i];
        return result;
    }

    public static String getMaxString(String[] arr)
    {
        if (arr==null) return "";
        String result = arr[0];
        for(int i = 1; i < arr.length; ++i)
            if (arr[i].compareTo(result) > 0) result = arr[i];
        return result;
    }
}