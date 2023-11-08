public class doublyLL {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node (int data){
            this.data = data;
            this.next= null;
            this.prev= null;
    }
}

public static Node head;
public static Node tail;
public static int size;

public void addFirst(int data){
Node newNode = new Node(data);
size++;
if(head == null){
    head = tail = newNode;
    return;
}
newNode.next = head;
head.prev = newNode;
head = newNode;
}

public void printLL(){
    Node temp = head;
    while(temp!= null){
        System.out.print(temp.data +"<->");
        temp = temp.next;
    }
System.out.println("null");
}

//remove first
public int removeFirst(){
    if(size==0){
        System.out.println("ll is empty");
        return Integer.MIN_VALUE;
    }else if( size==1){
        int val = head.data;
        head=tail=null;
        size=0;
        return val;
    }
    int val = head.data;
    head = head.next;
    head.prev = null;
    size--;
return val;
}
//Remove last
public int removeLast(){
    if(size==0){
        System.out.print("LL is empty");
        return -1;
    }
    if(size==1){
        int val = head.data;
        head = tail= null;
        return val;
    }

    Node temp = head;
    int i=0;
    while(i< size-2 ){
        temp =temp.next;
        i++;
    }
    // temp -> prev node 
    int val = tail.data;
    temp.next= null;
    tail.prev = null;
    tail = temp;
    size--;
    return val;
}

//reverse a LL
public void reverseDLL(){
    Node curr = head;
    Node prev=  null;
    Node next;

    if(curr != null){
        next = curr.next;
        curr.next = prev;
        curr.prev = next;
    
        prev = curr;
        curr = next;
    }
        head= prev;
}
public static void main(String[] args) {
    doublyLL dll = new doublyLL();
    dll.addFirst(4);
    dll.addFirst(5);
    dll.addFirst(6);

   // dll.removeLast();
    dll.printLL();
    dll.reverseDLL();
    dll.printLL();
    //System.out.println(dll.size);


}
}
