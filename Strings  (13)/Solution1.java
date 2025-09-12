// Reverse a string

import java.util.*;

public class Solution1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        Solution1 sol = new Solution1(); 
        String result = sol.solve(str); 
        System.out.println(result);
    }

    public String solve(String str) {

        char[] arr = str.toCharArray();
        int left = 0, right = arr.length -1;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        } 

        return new String(arr);
    }
}