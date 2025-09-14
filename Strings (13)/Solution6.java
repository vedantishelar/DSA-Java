// Find the first non-repeating character in a string

import java.util.*;

public class Solution6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        HashMap<Character,Integer>map = new HashMap<>();

        for( int i = 0; i < str.length(); i++ ) {

            char ch = str.charAt(i);

            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for( int i = 0; i < str.length(); i++ ) {

            char ch = str.charAt(i);

            if ( map.get(ch) == 1 ) {
                System.out.println(ch);
                break;
            }
        }

        in.close();
    }
}
