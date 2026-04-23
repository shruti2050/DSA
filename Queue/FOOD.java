import java.util.*;
public class FOOD{
    long taste;
    long d;
    FOOD(long taste,long d){
        this.taste = taste;
        this.d = d;
    }
    public static long maxTaste(int n, long m, int[] v,int[] d){
        PriorityQueue<FOOD> maxHeap = new PriorityQueue<>((a,b) -> Long.compare(b.taste,a.taste));


        //  add all food items
         for (int i = 0; i < n; i++) {
            maxHeap.offer(new FOOD(v[i], d[i]));
        }
    long total = 0;
    while(m-- > 0 && !maxHeap.isEmpty()){
        FOOD curr  = maxHeap.poll();

        if(curr.taste <= 0) break ;

        total += curr.taste;

        long nextTaste = curr.taste - curr.d;

        if(nextTaste > 0){
            maxHeap.offer(new FOOD(nextTaste, curr.d));
        } 
    }
    return total;
    }
    public static void main(String args[]){
     int n = 2;
        long m = 2;
        int[] v = {5, 7};
        int[] d = {2, 4};

        System.out.println(maxTaste(n, m, v, d));
    }
}