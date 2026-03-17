import java.util.*;
public class ContainsDuplicate{
public static boolean hasDuplicate(int[] nums){
    Set<Integer> seen = new HashSet<>();
    for(int n : nums){
        if(seen.contains(n)){
            return true;
        }
          seen.add(n);
    }
    
    return false;
}
public static void main(String args[]){
    int nums[] = {1,2,3,4,5,7,8,9};
    
 System.out.println(""+ hasDuplicate(nums));
}
}