import java.util.*;
public class Ques5{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String owner = sc.next();
            boolean good_move = false;
            boolean good = false;
            for (int i = 0; i < n; i++) {
            if(owner.charAt(i) != 'A')continue;

            good_move = false;
            for(int j =0; j < n; j++){

            }
        }

        int i =0;
        if(deck[0] == 'A'){
            int current_player = 'A';
        } else{
            int current_player = 'B';
        }
            

        }
    }
   static boolean beats(int n, int x, int y){
     if (x == 0) {
            return y == n - 1;
        }
        if (x == n - 1) {
            return y != 0;
        }
        return x > y;
   }
}