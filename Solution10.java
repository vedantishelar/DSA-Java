import java.util.*;

public class Solution10 {
    public static void main(String[] agrs) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        printSubsets(str, 0, "");
    }

    public static void printSubsets(String str, int index, String curr) {
        if (index == str.length()) {
            System.out.println(curr);
            return;
        }
        printSubsets(str, index +1, curr);
        printSubsets(str, index + 1, curr + str.charAt(index));
    }
}
