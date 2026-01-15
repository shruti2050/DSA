import java.util.*;
class prime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();

        // simple approach
        // for(int i = 1; i <= n; i++ ){
        //     if(n %i == 0){
        //         count++;
        //     }
        // }
        // if(count == 2){
        //     System.out.print("prime number");
        // }else{
        //     System.out.print("not a prime number");
        // }

        // optimized approach
        for(int i =1; i*i<= n; i++){
            if(n % i == 0){
                count++;
                if(i != n / i){
                    count++;
            }
        }
        }
        if(count == 2){
            System.out.print("prime number");
        }
        else{
            System.out.print("not a prime number");
        }
    }
    }
