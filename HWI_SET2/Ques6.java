import java.util.*;
class Ques6{
    public static void main(String args[]){
        Scanner sc = new  Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long l = sc.nextLong();
            long r = sc.nextLong();
            int sum =0;
            int win = 0;
            for(int i =0; i < n; i++){
                int x = sc.nextInt();
                sum += x;
                if(sum >= l && sum <= r){
                    win++;
                    sum = 0;
                }else if(sum > r){
                    sum =0;
                }
            }
            System.out.println(win);
    }
}
}