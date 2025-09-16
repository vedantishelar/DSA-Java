// Toggle case of characters in a string

import java.util.*;
public class Solution12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        String result = solve(str);
        System.out.println(result);
    }

    public static String solve(String str) {
        String result = "";  // Initialize result variable
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLowerCase(ch)) {
                result = result + Character.toUpperCase(ch);
            } 
            else {
                result = result + Character.toLowerCase(ch);
            }
        }
        return result;  
    }                                           
}