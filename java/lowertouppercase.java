import java.util.*;
public class lowertouppercase {
    public static void touppercase(String str){
        StringBuilder sb= new  StringBuilder("");
char ch= Character.toUpperCase(str.charAt(0));
sb.append(ch);
        for(int i=1; i<str.length(); i++){

            if(str.charAt(i)== ' ' && i <str.length()-1){
                sb.append(str.charAt(i));
                i++;.
    }
    public static void main(String args[]){
        // Scanner sc= new Scanner(System.in);
        String str = new Scanner(System.in).nextLine();
    }
    
}
