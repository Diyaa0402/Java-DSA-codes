import java.util.*;
public class reverse {
    public static void reverse_array(int number[]){
        int first=0, last = number.length-1 ;

        while(first < last){
        //swap 
        int temp= number[last];
        number[last]= number[first];
        number[first]= temp;
        first++;
        last--;
    }
}




public static void main(String args[]){
    int number[]= { 1, 2, 3, 4, 5, 6};

    reverse_array(number);
    for(int i=0; i<number.length; i++){
    System.out.print(number[i] + " ");
}
}
}
