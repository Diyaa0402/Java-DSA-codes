import java.util.LinkedList;

public class LinkedlistCF {

    public static void main(String[] args) {
    //create - objects
    LinkedList<Integer> ll = new LinkedList<>();

    //add
ll.addLast(1);
ll.addLast(2);
ll.addLast(3);
ll.addLast(4);
ll.addFirst(0);

System.out.println(ll);
    //remove
    ll.removeLast();
    ll.removeFirst();
    System.out.println(ll);
    }
    
}
