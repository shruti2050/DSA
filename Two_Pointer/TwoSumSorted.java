// Given an array of integers numbers that is sorted in non-decreasing order.

// Return the indices (1-indexed) of two numbers, [index1, index2], such that they add up to a given target number target and index1 < index2. Note that index1 and index2 cannot be equal, therefore you may not use the same element twice.
import java.util.*;
public class TwoSumSorted{

    public static int twosumsorted(int target, int[] nums ) {
        Set<Integer> set = new HashSet<>();

        for(int num : nums){
            int comp = target - num;
            if(!set.contains(comp)){
                set.add(comp);
            }
            return 
        }
               return 0;
    }
        

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int [] nums = new int[n];
            for(int i = 0; i < n; i++){
             nums[i] = sc.nextInt();
        }
    }
}