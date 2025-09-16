// Permutations of a string/array

import java.util.*;
public class Solution11{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        
        char[] arr = str.toCharArray();
        permutation(arr,0);
    }

    public static void permutation(char arr[], int position ){
        if(position == arr.length) {
            System.out.println(arr);
        }

        for(int i = position; i < arr.length; i++) {
            swap(arr,i,position);
            permutation(arr,position+1);
            swap(arr,i,position);
        }
    }

    public static void swap(char[] arr, int i, int position) {
        char temp = arr[i];
        arr[i] = arr[position];
        arr[position] = temp;
    }
}