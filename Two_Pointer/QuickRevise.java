import java.util.*;
public class QuickRevise{

     public static int TopKLargest(int[] nums, int k){
        Arrays.sort(nums);
        for(int i = nums.length -1; i > k; i--){
            System.out.println(nums[i]);
        }
        return 1;
    }
    public static void main(String args[]){
        int[] nums ={40,35,20,28,90,70,60};
        int k = 3;
        System.out.print(" " + TopKLargest(nums, k));
    }
   
}