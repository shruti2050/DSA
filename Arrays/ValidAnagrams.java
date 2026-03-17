// Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.


import java.util.*;
public class ValidAnagrams{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        System.out.println(Arrays.equals(sChars,tChars));


    }
}