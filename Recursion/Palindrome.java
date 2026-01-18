import java.util.Scanner;
import java.util.stream.Stream;
class Palindrome{



    static  boolean isPalindrome(String str, int i){
        int n = str.length();
        if(i <= n / 2){
            if(str.charAt(i) != str.charAt(n-i-1)) {
                return false;
            }
            return isPalindrome(str, i + 1);
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isPalindrome(str, 0));
    }
}