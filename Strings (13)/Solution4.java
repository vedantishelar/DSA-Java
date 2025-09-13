// Count the number of vowels in a string

import java.util.*;

public class Solution4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        String result = solve(str);
        System.out.println(result);
    }

    public static String solve(String str) {

        str = str.toLowerCase();
        int i = 0, j = str.length() - 1, count = 0;

        while (i <= j ) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i'|| c == 'o' || c == 'u') {
                count++;
            }
            i++;
        }
        
        return String.valueOf(count);
    }
}