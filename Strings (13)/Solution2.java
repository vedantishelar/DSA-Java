// Reverse a string using recursion

import java.util.*;

public class Solution2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        String result = solve(str); 
        System.out.println(result);

        in.close();
    }

    public static String solve (String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }
        return str.charAt(str.length() - 1) + solve(str.substring(0, str.length() - 1));
    }
}