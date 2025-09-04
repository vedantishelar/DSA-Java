import java.util.*;

public class Solution8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String[] words = line.split(" ", 2); 
        String str1 = words[0];
        String str2 = words[1];
        boolean result = result(str1, str2);
        System.out.println(result);
    }

    public static boolean result(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean res = false;
        if(Arrays.equals(arr1, arr2)) {
            res = true;
        }
        return res;
    }
}
