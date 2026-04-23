
import java.util.PriorityQueue;
import java.util.Queue; 

public class BasicExamples{
public static void main(String args[]){
    // create priority Queue
    Queue<String> pq = new PriorityQueue<>();

    //  adding elements
    pq.add("Java");
    pq.add("JS");
    pq.add("Python");
    pq.add("C++");
    pq.add("C");

// removing ele by poll() method and it returns the removed head 
    System.out.println("Queue" + pq);

    System.out.println(" updated Queue:  " + pq.poll());

    pq.remove();

System.out.println("Queue" + pq);

     // Access the head element without removing
        System.out.println("Head using peek(): " + pq.peek());      
        System.out.println("Head using element(): " + pq.element()); 

}
}