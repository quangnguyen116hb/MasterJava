package hackerrank.java.strings.java_string_tokens;

/**
 * Created by quang on 01/02/2017.
 */
import java.io.*;
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);

        String s = scanner.nextLine().trim();

        if (s.isEmpty()) {
            writer.println(0);
        }
        else {
            s = s.replaceAll("[^\\p{Alpha}]+"," ").trim();
            if (s.isEmpty()) {
                writer.println(0);
            }
            else
            {
                String [] strings = s.split("\\p{Space}+");
                writer.println(strings.length);
                for(String str : strings)
                    writer.println(str);
            }
        }
        scanner.close();
        writer.close();
    }
}
