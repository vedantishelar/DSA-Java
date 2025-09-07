// Count the occurrence / frequency of characters in a string

import java.util.*;

public class Solution5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution5 sol = new Solution5();
        
        String input = sc.nextLine();
        LinkedHashMap<Character, Integer> result = sol.solve(input);
        
        for (Map.Entry<Character, Integer> entry : result.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
    public LinkedHashMap<Character, Integer> solve(String input) {
        LinkedHashMap<Character, Integer> charCount = new LinkedHashMap<>();
        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
        }
        
        return charCount;
    }
}