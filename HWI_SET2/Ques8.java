import java.util.*;
public class Ques8{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            int ttt = sc.nextInt();
            while(ttt-- > 0){
                long lll = sc.nextLong();
                long rrr = sc.nextLong();
                int ans =0;
                ans += rrr - lll ;
                lll /= 10;
                rrr /= 10;
                System.out.println(ans);
            }
    }
}