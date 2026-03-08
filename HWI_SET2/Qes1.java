import java.util.*;
public class Qes1{
 public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String s1 = "hello";
    String s = sc.next();
    int count = 0;
    int j = 0;
    for(int i =0; i < s.length(); i++){
        if(s.charAt(i) == s1.charAt(j)){
            count++;
            j++;

        }
    }
    if(j == s1.length()){
        System.out.println("YES");
                return;
    }else{
        System.out.println("No");
    }
 }
}