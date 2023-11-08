import java.util.*;
public class binarysearch {
    public static int binary(int num[], int key){
        int start=0;
        int n= num.length;
        int end= n-1;
        while(start<=end){
            int mid= (start+end)/2;
            if(num[mid]==key){
                return mid; 
            }if(num[mid] >key){
                end= mid-1;
            }else{
                start= mid +1;
            }
        }
        return -1;
        
    }
    public static void main(String args[]){
        int num[]={ 1, 5, 14, 19, 24, 28, 30, 60, 76, 89, 96};
        int key=60;
        System.out.print("key is at index = "+ binary(num, key) );
}
    
}
