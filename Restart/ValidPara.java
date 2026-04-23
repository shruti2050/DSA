import java.util.*;
public class ValidPara{

    public static boolean isValid(String str){
        Stack<Character> st = new Stack<>();
         char[] ch = str.toCharArray();

         for(char c : ch){
            if(c == '(' || c == '{' || c == '[') {
                st.push(c);
            }else{
                if(st.isEmpty()) return false;
                        char top = st.pop();

               if(c == ')' && top != '(') return false;
               if(c == ']' && top != '[') return false;
               if(c == '}' && top != '{') return false;

            }
           
         }
          return st.isEmpty();
    }


    public static void main(String args[]){
        String str = "({[]})";
        System.out.print(isValid(str));
    }
}