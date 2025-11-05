import java.util.*;
class FourSum_7 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        if(n<4) return result;

    Arrays.sort(nums);

    for(int i =0;i<n-3;i++){

    if (i > 0 && nums[i] == nums[i - 1]) continue;

        for(int j=i+1;j<n-2;j++){

            if(j>i+1 && nums[j]==nums[j-1]) continue;

            long remaining = (long)target - nums[i] - nums [j];
            int left = j+ 1, right = n-1;
            while(left < right){
                long sum = nums[left] +nums[right];
                if(sum == remaining){
                    result.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
            while (left < right && nums[left] == nums[left + 1]) left++;
            while (left < right && nums[right] == nums[right - 1]) right--;
            left ++;
            right --;
                }
                else if(sum < remaining){
                    left++;
                }else{
                    right--;
                }
            }
        }
    }
    return result;
    }

    public static void main(String[] args) {
        int nums[] = {1,0,-1,0,-2,2};
        int target = 0;
        FourSum_7 fs = new FourSum_7();
        System.out.println(""+fs.fourSum(nums, target) );
    
        
    }

    }
