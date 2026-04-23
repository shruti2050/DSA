import java.util.*;
public class Ques1{

    public static int[] TwoSum(int[] nums, int target){

        HashMap<Integer, Integer> map = new HashMap<>();
            for(int i =0; i < nums.length; i++){
            int comp = target - nums[i];
            if(map.containsKey(comp)){
                return new int[]  { map.get(comp),i };
            }
            map.put(nums[i],i);
            }

     throw new IllegalArgumentException("No two sum solution");
    }
    public static void main(String args[]){
        int[] nums = {2,7,11,15};
        int target = 9;

            System.out.println(Arrays.toString(TwoSum(nums, target)));
    }
}