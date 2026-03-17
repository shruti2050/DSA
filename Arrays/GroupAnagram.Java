// Given an array of strings strs, group all anagrams together into sublists. You may return the output in any order.

// An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.
import java.util.*;
public class GroupAnagram{
    public static List<List<String>> groupAnagram(String strs[]){
        HashMap<String,List<String>> map = new HashMap<>(); 

            for(String str : strs){

                char[] chars = str.toCharArray();
                Arrays.sort(chars);

                String key = new String(chars);

                if(!map.containsKey(key)){
                    map.put(key, new ArrayList<>());
                }
                    map.get(key).add(str);
            }
            return new ArrayList<>(map.values());
    }
    public static void main(String args[]){
    String [] strs = {"act","pots","tops","cat","stop","hat"};
    System.out.println("" + groupAnagram(strs));
    }
}