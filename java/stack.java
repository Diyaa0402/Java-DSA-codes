import java.util.*;
public class stack {
    // static class Node{
    //     int data;
    //     Node next;
    //     Node (int data){
    //         this.data = data;
    //         this.next = null;
    //     }
    // }

    // static class Stack{
    //     static Node head = null;
    
    //     public static boolean isEmpty(){
    //         return head == null;
    //     }

    //     public static void push(int data){ 
    //         Node newNode = new Node(data);
    //         if(isEmpty()){
    //             head = newNode;
    //             return;
    //         }
        
    //         newNode.next = head;
    //         head = newNode;
    //     }

    //     public static int pop(){
    //     if(isEmpty()){
    //         return -1;
    //     }
    //         int data = head.data;
    //         head = head.next;
    //         return data;
    //     }

    //     public static int peek(){
    //         if(isEmpty()){
    //             return -1;
    //         }

    //         return head.data;
//     }
// }
    //Using ARRAYLIST
    // static class Stack{
    // static ArrayList<Integer> List = new ArrayList<>();

    // //empty stack
    // public static boolean isEmpty(){
    //     return List.size () == 0;
    // }

    // //push
    // public static void push(int data){
    //     List.add(data);
    // }

    // //pop
    // public static int pop(){
    //     if(isEmpty()){
    //         return -1;
    //     }
    //     int top= List.get(List.size() - 1);
    //     List.remove(List.size() - 1);
    //     return top;
    // }

    // //peek
    // public static int peek(){
    //     if(isEmpty()){
    //         return -1;
    //     }
    //     int top= List.get(List.size() - 1);
    //     return top;    
    // }

    public static void main(String args[]){
        // Stack s = new Stack();
        Stack <Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();

        }

    }
    
}
