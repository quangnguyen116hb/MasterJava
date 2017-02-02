package hackerrank.java.strings.valid_username_checker;

/**
 * Created by quang on 02/02/2017.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String username = in.nextLine();
            String pattern = "^([A-Za-z]{1,1}[A-Za-z0-9_]{7,29})$";
            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(username);

            if (m.find( )) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
            testCases--;
        }
    }
}

/*
 String pattern = "^([A-Za-z]{1,1}[A-Za-z0-9_]{7,29})$";
 
^ Beginning. Matches the beginning of the string, or the beginning of a line if the multiline flag (m) is enabled.
( Capturing group #1. Groups multiple tokens together and creates a capture group for extracting a substring or using a backreference.
[ Character set. Match any character in the set.
A-Z Range. Matches a character in the range "A" to "Z" (char code 65 to 90).
a-z Range. Matches a character in the range "a" to "z" (char code 97 to 122).
]
{1,1} Quantifier. Match 1 of the preceding token.
[ Character set. Match any character in the set.
A-Z Range. Matches a character in the range "A" to "Z" (char code 65 to 90).
a-z Range. Matches a character in the range "a" to "z" (char code 97 to 122).
0-9 Range. Matches a character in the range "0" to "9" (char code 48 to 57).
_ Character. Matches a "_" character (char code 95).
]
{7,29} Quantifier. Match between 7 and 29 of the preceding token.
)
$ End. Matches the end of the string, or the end of a line if the multiline flag (m) is enabled.
 */