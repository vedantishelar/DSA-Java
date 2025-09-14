// Check if two strings are anagrams

import java.util.*;

public class Solution8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str1 = in.nextLine();
        String str2 = in.nextLine();

        String result = solve(str1, str2);
        System.out.println(result);
    }

    public static String solve(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() != str2.length()) {
            return "false";
        } 

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            return "true";
        } else {
            return "false";
        }
    }
}
