import java.util.*;
public class Queue {
        static class Queuee{
            static int arr[];
            static int size;
            static int rear;

        Queuee(int n){
            arr= new int[n];
            size = n;
            rear = -1;
        }
        public static boolean isEmpty(){
            return rear ==-1;
        }
        //add-> TC= O(1)
        public static void add(int data){
            if(rear == size-1){
                System.out.println("Queue is Full");
                return;
            }
            rear = rear+1;
            arr[rear] = data;
        }

        //Remove -> TC= O(n)
        public static int remove(){
            if(isEmpty()){
                System.out.println("queue is already empty");
                return -1;
            }
            int front = arr[0];
            for(int i=0; i<rear; i++){
                arr[i]= arr[i+1];
            }
            rear = rear-1;
            return front;
            }

            public static int peek(){
                if(isEmpty()){
                System.out.println("queue is already empty");
                return -1;
            }
            return arr[0];
            }
        }

    public static void main(String[] args) {
        Queuee q = new Queuee(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
    
}
