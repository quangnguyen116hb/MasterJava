package hackerrank.java.strings.java_regex;

/**
 * Created by quang on 01/02/2017.
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{

    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex {
    public final String pattern = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5]).([01]?\\d\\d?|2[0-4]\\d|25[0-5]).([01]?\\d\\d?|2[0-4]\\d|25[0-5]).([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
    /*
    * Tham khảo https://www.mkyong.com/regular-expressions/how-to-validate-ip-address-with-regular-expression/
    * http://regexr.com/
    * ( Capturing group #1. Groups multiple tokens together and creates a capture group for extracting a substring or using a backreference.
    [ Character set. Match any character in the set.
        0 Character. Matches a "0" character (char code 48).
        1 Character. Matches a "1" character (char code 49).
    ]
    ? Optional. Match between 0 and 1 of the preceding token.

    \d Digit. Matches any digit character (0-9).
    \d Digit. Matches any digit character (0-9).
    ? Optional. Match between 0 and 1 of the preceding token.

    | Alternation. Acts like a boolean OR. Matches the expression before or after the |.
    2 Character. Matches a "2" character (char code 50).

    [ Character set. Match any character in the set.
        0-4 Range. Matches a character in the range "0" to "4" (char code 48 to 52).
    ]
    \d Digit. Matches any digit character (0-9).

    | Alternation. Acts like a boolean OR. Matches the expression before or after the |.

    2 Character. Matches a "2" character (char code 50).
    5 Character. Matches a "5" character (char code 53).

    [ Character set. Match any character in the set.
        0-5 Range. Matches a character in the range "0" to "5" (char code 48 to 53).
    ]
    )
     */
}