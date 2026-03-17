import java.util.*;
public class Ques9{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n =sc.nextInt();
            String str = sc.next();
            Stack<Integer> end0 = new Stack<>();
            Stack<Integer> end1 = new Stack<>();
            int[] ans = new int[n];
            int seqCount = 0;
            for(int i =0; i < str.length();i++){
                char c = str.charAt(i);
                if(c == '0'){
                    if(!end1.isEmpty()){
                        int id = end1.pop();
                        ans[i] = id;
                        end0.push(id);
                    }else{
                        seqCount++;
                        ans[i] = seqCount;
                        end0.push(seqCount);
                    }
                }
                else{
                        if(!end0.isEmpty()){
                            int id = end0.pop();
                            ans[i] = id;
                            end1.push(id);
                        }else{
                            seqCount++;
                            ans[i] = seqCount;
                            end1.push(seqCount);
                        }
                    }
                }
                System.out.println(seqCount);
                for(int x : ans){
                    System.out.print(x + " ");
                }
                System.out.println();
            }

        }
    }
