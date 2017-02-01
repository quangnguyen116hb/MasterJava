package hackerrank.java.introduction.java_date_and_time;

/**
 * Created by quang on 01/02/2017.
 */

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        int m = Integer.parseInt(month);
        int d = Integer.parseInt(day);
        int y = Integer.parseInt(year);
        //System.out.printf("%d %d %d%n", m, d, y);
        Date date = new Date(y-1900, m-1, d);
        Calendar calendar = Calendar.getInstance();
        //System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        calendar.setTime(date);
        //System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        String result = "";
        switch(calendar.get(Calendar.DAY_OF_WEEK)) {
            case Calendar.MONDAY: result = "MONDAY"; break;
            case Calendar.TUESDAY: result = "TUESDAY"; break;
            case Calendar.WEDNESDAY: result = "WEDNESDAY"; break;
            case Calendar.THURSDAY: result = "THURSDAY"; break;
            case Calendar.FRIDAY: result = "FRIDAY"; break;
            case Calendar.SATURDAY: result = "SATURDAY"; break;
            case Calendar.SUNDAY: result = "SUNDAY"; break;
            default: break;
        }
        System.out.println(result);
    }
}
