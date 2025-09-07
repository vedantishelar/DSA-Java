import java.util.*;

public class Solution10 {
    public static void main(String[] agrs) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        printSubset(str, 0, "");
    }

    public static void printSubset(String str, int index, String curr) {
        if (index == str.length()) {
            System.out.println(curr);
            return;
        }
        printSubset(str, index +1, curr);
        printSubset(str, index + 1, curr + str.charAt(index));
    }
}
