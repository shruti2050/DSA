import java.util.*;
public class Qes4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            char card1 = s.charAt(0);
            char cardn = s.charAt(n-1);
            if(card1 == 'B' && cardn == 'B'){
                System.out.println("BOB wins");
            }else{
                System.out.println("Alice wins");
            }
        }
    }
}