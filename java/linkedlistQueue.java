public class linkedlistQueue {
        static class Node{
            int data;
            Node next;
        
            Node(int data){
                this.data = data;
                this.next = null;
            }
    }
    static class Queue{
            static Node head = null;
            static Node tail = null;
            static int size;

        public static boolean isEmpty(){
            return head==null && tail== null;
            }

            public static void add(int data){
                Node newNode = new Node(data);
                if(head == null){
                    head= tail= newNode;
                    return;
                }

                tail.next=newNode;
                tail = newNode;
            }
        public static int remove(){
            if(head== null){
                System.out.println("Queue is already empty");
                return -1;
            }
            int front = head.data;
            if(head == tail){
                tail = head = null;
            }else{
            head = head.next;
            }
            return front;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }

            return head.data;

        }
    }
    public static void main(String[] args) {
Queue q = new Queue();
q.add(1);
q.add(2);
q.add(3);
q.add(4);

while(!q.isEmpty()){
    System.out.println(q.peek());
    q.remove();
}
    }
}
