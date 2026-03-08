// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Ques2{
    static boolean wins(int x1, int y1, int x2, int y2){
        int suneet = 0, salvic =0;
        if(x1 > y1) suneet++;
        else if(x1 < y1)salvic++;
        else if(x2 > y2) suneet++;
        else if(x2 < y2) salvic++;
        return suneet > salvic;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int ans =0;
        if(wins(a1,b1,a2,b2))ans++;
        if(wins(a1,b2,a2,b1))ans++;
        if(wins(b1,a1,b2,a2))ans++;
        if(wins(b2,a2,b1,a1))ans++;
        System.out.println(ans);
        }        
    }
}