import java.util.*;
public class bubblesort {
    public static void bubble(int arr[]){
        int n= arr.length;
        for(int i=0; i<n-1; i++){ // turns
            // int swaps=0;
            for(int j=0; j<n-1-i; j++){
                if(arr[j]< arr[j+1]){
            int temp= arr[j];
            arr[j]=arr[j+1];
            arr[j+1]= temp;

            // swaps++;
        }
        // if(swaps==0){
        //     System.out.println("Array is sorted");
        //     System.out.println("swaps =" +swaps);
        //     break;
        // }
        }
    }
}

public static void printarr(int arr[]){
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}

    

public static void main(String args[]){
    int arr[]={3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
    bubble(arr);
    printarr(arr);

    
}
}