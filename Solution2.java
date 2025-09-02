import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(reverseString(input));
    }

    public static String reverseString(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        char lastChar = s.charAt(s.length() - 1);
        String reversedSubstring = reverseString(s.substring(0, s.length() - 1));
        return lastChar + reversedSubstring;
    }
}