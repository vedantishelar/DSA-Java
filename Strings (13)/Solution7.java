// Check if a string contains only digits

// Using regex

import java.util.*;
public class Solution7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        String result = solve(str);
        System.out.println(result);
    }

    public static String solve(String str) {

        boolean result = str.matches("\\d+");
        if (result) {
            return "true";
        } else {
            return "false";
        }
    }
}


// Without using regex that is using iteration

/*

import java.util.*;

public class Solution7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        String result = solve(str);
        System.out.println(result);
    }

    public static String solve(String str) {

        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < '0' || arr[i] > '9') {
                return "false";
            }
        }
        return "true";

    }
}

 */