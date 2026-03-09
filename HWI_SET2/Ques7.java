import java.util.*;
public class Ques7{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            int count =0;
            // if(s.length() <= 100){
            //     System.out.println("invalid string");
            // }
        for(int  i= 0; i < s.length() - 1 ;i++){
            if(s.charAt(i) == 'v' && s.charAt(i+1) == 'v'){
                count++;
            }
            }
            System.out.println(count);
        }
    }
}