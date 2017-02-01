package hackerrank.java.strings.pattern_syntax_checker;

/**
 * Created by quang on 01/02/2017.
 */
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);
        int testCases = Integer.parseInt(scanner.nextLine());
        while(testCases>0){
            String pattern = scanner.nextLine();
            //writer.println(testCases);
            try {
                Pattern.compile(pattern);
                writer.println("Valid");
            }
            catch (PatternSyntaxException e) {
                writer.println("Invalid");
            }
            testCases--;
        }
        scanner.close();
        writer.close();
    }
}