public class Linkedlist1 {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next= null;

        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst (int data){  
        // TC = O(1)
        // Step 1 : create new node
        Node newNode= new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step 2 : newNode next = head
        newNode.next= head; // Linking step

        //Step3 : newnode = head
        head= newNode;
    }
    
      // TC = O(1)

    public void printLinkedList(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
    while(temp!= null){
        System.out.print(temp.data+ "->");
        temp = temp.next;
    }
    System.out.println("null");
    }

    public void addAtIndex(int data, int index){
        if(index ==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while(i< index-1){
            temp=temp.next; 
            i++;
        } 

        // i= indx -1 , temp-> prev node 
        newNode.next = temp.next;
        temp.next = newNode;

    }




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
    size--;
return val;
}

public int removeLast(){
    if(size==0){
        System.out.print("LL is empty");
        return Integer.MIN_VALUE;
    }else if(size==1){
        int val = head.data;
        head=tail=null;
        size=0;
        return val;
    }
    int val=tail.data;
    Node temp = head;
    int i=0;
    while(i< size-2 ){
        temp =temp.next;
        i++;
    }
    // temp -> prev node 
    temp.next= null;
    tail = temp;
    size--;
    return val;
}

// using loops(iteration)
public int SearchKey(int key){

    Node temp= head;
    int i=0;
    while(temp!= null){
        if(temp.data == key){
            return i;
        }
        temp = temp.next;
        i++;
    }
    return -1;
}

//Using recursion

public int Helper(Node head , int key){  //O(n)

    if( head== null){
        return -1;
    }
if(head.data == key){
        return 0;
    }
    int idx = Helper(head.next , key);
    if(idx == -1){
        return -1;
    }
    return idx +1 ;
}
public int recSearch(int key){
    return Helper(head , key);
}


public void reverseLl(){
    Node prev = null;
    Node curr = tail= head;
    Node next;

    while(curr!= null){
        next= curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    
    }
    head = prev;
    return ;
}


public void removeNthNodeEnd(int n){
    int size = 0;
    Node temp = head;
    while(temp!= null){
        temp = temp.next;
        size++;
    }

    if(n== size){
        head= head.next;
        return;
    }

    int i=1;
    int iToFind= size-n;
    Node prev = head;

    while(i<iToFind){
        prev = prev.next;
        i++;
    }
        prev.next=prev.next.next;
        return;
    }

// slow fast approach
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast!= null && fast.next !=null ){
                slow = slow.next; // +1
                fast = fast.next.next; //+2
        }
        return slow; // slow is the midNode
    }

    public boolean checkPalindrome(){

        if(head==null || head.next==null){
            return true;
        }
    
        //step1: find mid
            Node midNode = findMid(head);

        //step2: reverse 2nd half
        Node prev= null;
        Node curr=midNode;
        Node next;

        while(curr!= null){
            next= curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
             Node right = prev;  //right half head;
            Node left = head;

        //step3: check left half and right half
        while(right!=null ){
            if(left.data !=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
return true;


    }

    public static void main(String[] args) {
        Linkedlist1 ll = new Linkedlist1();
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(3);
        // ll.addAtIndex(10,2 );
        // ll.addLast(4);
       // ll.removeFirst();
       // ll.removeLast();
        // ll.printLinkedList();
        // System.out.println(ll.recSearch(3));
    // System.out.println(ll.SearchKey(4));
    // System.out.println(ll.SearchKey(11));
        // System.out.println(ll.size);
        // ll.reverseLl();
        // ll.printLinkedList();
        // ll.removeNthNodeEnd(3);
        // ll.printLinkedList();

            ll.addLast(1);
            ll.addLast(2);
            ll.addLast(2);
            ll.addLast(1);
        System.out.println(ll.checkPalindrome());    
    }
}
    

