// Check for leap year

import java.util.*;
public class Solution5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();

        boolean result = solve(year);
        System.out.println(result);
    }
     
    public static boolean solve(int year) {
        if (year % 400 == 0) {
            return true;   // divisible by 400 → leap year  
        } else if (year % 100 == 0) {  
            return false;  // divisible by 100 but not 400 → not leap  
        } else if (year % 4 == 0) {  
            return true;   // divisible by 4 but not 100 → leap   
        } else { 
            return false;  // everything else → not leap
        }
    }
}