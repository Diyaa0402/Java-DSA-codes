import java.util.*;
public class stackques {

    public static void pushAtBottom(Stack<Integer> s , int data){
        if(s.empty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static String reverseString(String str){
Stack<Character> r = new Stack<>();
int idx =0;
while(idx< str.length()){
    r.push(str.charAt(idx));
    idx++;
}

StringBuilder result = new StringBuilder("");
while(!r.empty()){
    char curr = r.pop();
    result.append(curr);
}
return result.toString();
    }

public static void reverseStack(Stack<Integer> s){
    if(s.empty()){
        return;
    }
int top = s.pop();
reverseStack(s);
pushAtBottom(s, top);
}
    public static void printStack(Stack<Integer> s){
        while(!s.empty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {

        // String str ="abc";
        // String result = reverseString(str);
        // System.out.println(result);
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);   

        reverseStack(s);
        printStack(s);
        // pushAtBottom(s , 4);
        // while(!s.empty()){
        //     System.out.println(s.peek());
        //     s.pop();
        }
    }
    

