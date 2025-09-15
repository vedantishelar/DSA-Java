// String reversal without built-in functions

import java.util.*;

public class Solution9{ 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        
        String result = solve(str);       
        System.out.println(result);
    }

    public static String solve(String str) {
        String reversed = "";
        for(int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }
        return reversed;
    }
}