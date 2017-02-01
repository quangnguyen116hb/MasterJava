package hackerrank.java.introduction.java_if_else;

/**
 * Created by quang on 01/02/2017.
 */

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String ans="";
        if(n%2==1){
            ans = "Weird";
        }
        else{
            if (n>=2 && n<5) ans = "Not Weird";
            else if (n>=6 && n <= 20) ans = "Weird";
            else ans = "Not Weird"; //Complete the code

        }
        System.out.println(ans);

    }
}
