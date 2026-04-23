
import java.util.PriorityQueue;
import java.util.Queue;
public class TopKElement{
    public static void main(String args[]){
        Queue<Integer> pq = new PriorityQueue<>();
        int[] nums = {90,70,65,30,100};
        int k = 3;
        for(int n : nums){
            pq.add(n);
            if(pq.size() > k){
                pq.poll();
            }
        }
        while(!pq.isEmpty()){
               System.out.println(pq.poll());
        }

    }
}