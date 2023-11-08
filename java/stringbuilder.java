import java.util.*;
public class stringbuilder {
    public static void main(String args[]){
        StringBuilder sb= new StringBuilder("");
        for(char ch='a'; ch<='z'; ch++){
            sb.append(ch);
            //abcdefghijklmnopqrstwxyz
            //O(26)
            //O(26 *n2)
        }
System.out.println(sb);
System.out.println(sb.length());

    }
    
}
