// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class LinkedList {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null; 
        }
    }
    Node head = null;
    
    void insert(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
        }else{
            Node temp = head;
            while(temp.next!= null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    
    void delete(int key){
        Node temp = head , prev = null;
        
        if(temp != null && temp.data == key){
            head = temp.next;
            return;
        }
        if(temp != null && temp.data != key){
            prev = temp;
            temp = temp.next;
        }
        
        if(temp == null){
            System.out.println("Data not found");
        }
        // prev.next = temp.next;
        
    }
    
    void display(){
        Node temp = head ;
        while(head!= null){
        System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    
    
    
    public static void main(String[] args) {
     LinkedList list = new LinkedList();
     list.insert(20);
     list.insert(30);
     list.insert(22);
     list.insert(21);
     list.delete(15);
     list.display();
        }
    }
