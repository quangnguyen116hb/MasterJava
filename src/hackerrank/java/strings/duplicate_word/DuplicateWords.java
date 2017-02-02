package hackerrank.java.strings.duplicate_word;

/**
 * Created by quang on 02/02/2017.
 */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {

    public static void main(String[] args) {

        String regex = "\\b(\\w+)(\\b\\W+\\b\\1\\b)*";
        /**
         * Explain the regex
         \b Word boundary. Matches a word boundary position such as whitespace, punctuation, or the start/end of the string.
         ( Capturing group #1. Groups multiple tokens together and creates a capture group for extracting a substring or using a backreference.
         \w Word. Matches any word character (alphanumeric & underscore).
         + Plus. Match 1 or more of the preceding token.
         )
         ( Capturing group #2. Groups multiple tokens together and creates a capture group for extracting a substring or using a backreference.
         \b Word boundary. Matches a word boundary position such as whitespace, punctuation, or the start/end of the string.
         \W Not word. Matches any character that is not a word character (alphanumeric & underscore).
         + Plus. Match 1 or more of the preceding token.
         \b Word boundary. Matches a word boundary position such as whitespace, punctuation, or the start/end of the string.
         \1 Backreference. Matches the results of capture group #1.
         \b Word boundary. Matches a word boundary position such as whitespace, punctuation, or the start/end of the string.
         )
         * Star. Match 0 or more of the preceding token.
         */
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                //System.out.println(m.group());
                //System.out.println(m.group(0));
                //System.out.println(m.group(1));
                input = input.replaceAll(m.group(0), m.group(1));
            }

            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();
    }
}
