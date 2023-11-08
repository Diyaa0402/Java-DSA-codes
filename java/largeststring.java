import java.util.*;
public class largeststring {
    public static void largest(String fruits[]){
        String large= fruits[0];

        for(int i=1; i<fruits.length;i++ ){
            if(large.compareTo(fruits[i])<0){
                large=fruits[i];
            }
        }
        System.out.print("Largest string="+large);

    }
    public static void main(String args[]){
String fruits[]={"apple", "banana", "grapes"};
largest(fruits);
    }
    
}
//TIME COMPLEXITY = O(x*n )
