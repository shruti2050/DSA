// Given a string s, return true if it is a palindrome, otherwise return false.

// A palindrome is a string that reads the same forward and backward. It is also case-insensitive and ignores all non-alphanumeric characters.

// Note: Alphanumeric characters consist of letters (A-Z, a-z) and numbers (0-9).

import java.util.*;
public class ValidPalindrome{

    public static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length()-1;
        str = str.toLowerCase();
        while(left < right){
           if(str.charAt(left) != str.charAt(right)){
                return false;
           }
           left++;
           right--;
        }
        
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(" " + isPalindrome(str));
    }
}