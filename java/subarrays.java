import java.util.*;
public class subarrays {
    // subarrays-> a continuous part of array
    public static void printsubarrays(int num[]){
        for(int i=0; i<num.length; i++){
            int start= i;
            for(int j=i; j<num.length; j++){
                int end= j;
                for(int k=start; k<=end; k++){
                    System.out.print(num[k] +" "); // to print sub arrays
                }
                System.out.println();

            }
            System.out.println();
        }
    }
    public static void main(String arg[]){
        int num[]= {2, 4, 6, 8, 10};
        printsubarrays(num);

    }
}
