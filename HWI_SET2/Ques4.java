// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Ques4 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int t = sc.nextInt();
     while(t-- > 0){
     int n = sc.nextInt();
     long k = sc.nextLong();
     long sum =0;
     HashSet<Long> set = new HashSet<>();
     for(int i =0; i < n; i++){
         long x = sc.nextLong();
         sum += x;
         set.add(x);
     }
     if((sum + k) % 2 != 0){
         System.out.println("NO");
        continue;
     }
     long target = (sum +k)/2;
     if(set.contains(target)){
         System.out.println("YES");
     }else{
         System.out.println("NO");
     }
     }
    }
}