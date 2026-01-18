import java.util.*;
class ReverseArr{

    // using two pointers left and right
    // static void Reverse(int[] arr, int l, int r){
    //     if(l >= r){
    //         return;
    //     }

    //     int temp = arr[l];
    //     arr[l] = arr[r];
    //     arr[r] = temp;

    //     Reverse(arr, l+1, r-1);
    // }
    

    
    // public static  void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int[] arr = new int[n];
    //     for(int i = 0; i < n; i++){
    //         arr[i] = sc.nextInt();
    //     } 
    //     Reverse(arr,0,n-1);
    //     for(int x : arr){
    //         System.err.println(x +" ");
    //     }
    // }



    // using one pointer
    static void Reverse(int[] arr, int i){
        if(i >= arr.length/ 2){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[arr.length -i -1];
        arr[arr.length-i-1] = temp;
        Reverse(arr,i+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int [5];
        for(int i =0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        Reverse(arr,0);
        for(int x : arr){
            System.out.println(x + " ");
        }
    }
}