package hackerrank.java.introduction.java_end_of_file;

/**
 * Created by quang on 01/02/2017.
 */
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        while(input.hasNext())
        {
            ++i;
            String s = input.nextLine();
            System.out.printf("%d %s%n", i, s);
        }
    }
}
