import java.util.LinkedList;
public class Linkedlist2 {
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
    public static Node size;

    public void addLast(int data){  
        Node newnode = new Node(data);
        //size++;
        if(head  == null){
            head= tail= newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }
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

    public static boolean existCycle(){
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast= fast.next.next;

            if(slow == fast){
                return true;
            }
        }
        return false;

    }

    public static void removeCycle(){
        //detect cycle
    Node slow = head;
    Node fast= head;
    boolean cycle =false;

    while(fast!= null && fast.next!=null ){
        slow = slow.next;
        fast = fast.next.next;

        if(slow == fast){
            cycle = true;
            break;
        }
    }
if(cycle == false){
    return;
}

        //find meeting points
slow = head;
Node prev = null;  

while(slow != fast){
    prev = fast; // last node
    slow = slow.next;
    fast= fast.next;

}  
//remove cycle
prev.next = null;
        }




public Node getMid(Node head){
    Node slow = head;
            Node fast = head.next;
            while(fast!= null && fast.next!= null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow; //midNode
}
private Node merge (Node LH, Node RH){
    Node mergeLL = new Node(-1);
    Node temp = mergeLL;
//LH - left head , RH - right head
    while(LH != null && RH!= null){
        if(LH.data <= RH.data){
            temp.next = LH;
            LH = LH.next;
            temp = temp.next;
        }else {
            temp.next = RH;
            RH= RH.next;
            temp = temp.next;
        }
    }
while (LH != null){
            temp.next = LH;
            LH = LH.next;
            temp = temp.next;
}
while (RH != null){
            temp.next = RH;
            RH= RH.next;
            temp = temp.next;
}
return mergeLL.next;
}
        public Node mergeSortLL(Node head){  // O(log n)
            if(head == null || head.next == null ){
                return head;
            }

            // Middle of the LL
            Node mid = getMid(head);

            //Right Left LL MS
            Node righthead = mid.next; // right half
            mid.next = null; // left half
            Node newleft = mergeSortLL(head);
            Node newRight = mergeSortLL(righthead);

            //merge
return merge(newleft, newRight);
        }

        public void ZigZagLL(Node head){
            //find mid
            Node mid = getMid(head);

            //1st half 2nd half and reverse 
            Node Rhalf = mid.next;
            mid.next= null;
            Node prev = null;
            while(Rhalf != null){
                Node next = Rhalf.next;
                Rhalf.next = prev;
                prev = Rhalf;
                Rhalf = next;
            }

            //Alternate merging
            Node LH = head;
            Node RH = prev;
            Node nextL , nextR;
            while(LH != null && RH != null){
                //zigzag method
                nextL = LH.next;
                LH.next = RH;
                nextR = RH.next;
                RH.next =nextL;

                //update
                LH = nextL;
                RH = nextR;
            }
        }


    public static void main(String args[]) {
        // head= new Node(1);
        // Node temp = new Node(2);
        //     head.next= temp;
        //     head.next.next= new Node(3);
        //         head.next.next.next=temp;
        //         //1-> 2->3 ->2
        //         System.out.println(existCycle());
        //         removeCycle();
        //         System.out.println(existCycle());

        Linkedlist2 ll = new Linkedlist2();
                    ll.addLast(10);
                    ll.addLast(11);
                    ll.addLast(21);
                    ll.addLast(51);
                    ll.addLast(41);
                    ll.addLast(61);
                    // 10-> 11-> 21-> 51-> 41-> 61
                    // ll.printLinkedList();
                    // ll.head = ll.mergeSortLL(ll.head);
                    // ll.printLinkedList();

                    ll.printLinkedList();
                    ll.ZigZagLL(head);
                    ll.printLinkedList();
                }
}
    

