// Online Java Compiler
//count the no of digits and return the last digit

import java.util.*;
class countdigitandreturnlast {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Digits: ");
        int n = sc.nextInt();
       int count = 0;
      while(n > 0){
          int l = n % 10;
        System.out.println(l);
          n = n/10;
         System.out.println(n); 
         count++;
        
      }
      System.out.println(count);
    }
}