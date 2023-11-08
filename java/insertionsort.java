import java .util.Arrays;
import java .util.Collection;
public class insertionsort {
    public static void insertion(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr=arr[i];
            int prev = i-1;
            // finding out the correct pos to insert
            while(prev>=0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1]= curr;
        }
    }
    public static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");

        }
        System.out.println();

    }
    public static void main(String args[] ){
       // Integer arr[]={ 30, 10, 90, 80, 100, 60};
       // Arrays.sort(arr);
       // Arrays.sort(arr , 1, 5);
      //  Arrays.sort(arr , 1, 5, Collections.reverseOrder());
        int arr[]= {1,80, 56, 47, 32, 19};
    insertion(arr);

        printarr(arr);

    }
    
}
//