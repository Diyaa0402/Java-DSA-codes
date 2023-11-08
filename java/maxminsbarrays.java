import java.util.*;
public class maxminsbarrays {
    public static void maxsubarrays(int number[]){
        int currsum=0;
        int maxsum= Integer.MIN_VALUE; // -infinity
        for(int i=0; i<number.length; i++){
            for(int j=i; j<number.length; j++){
                currsum=0;
                for(int k=i; k<=j; k++){
                    //System.out.print(number[k]+ " ");
                    currsum+=  number[k];
                }
                    System.out.println("sum of subarrays =" +currsum);
                    if(maxsum < currsum){
                        maxsum=currsum;
                    }

                }
                
            }
            System.out.println("Max sum ="+maxsum);

        }
        public static void minsubarrays(int number[]){
            int currsum=0;
            int minsum= Integer.MAX_VALUE; //+infinity
            for(int i=0; i<number.length; i++){//start
                for(int l=i; l<number.length; l++){
                    currsum=0;
                    for(int k=i; k<=l; k++){
                        currsum+=number[k];
} 
System.out.println(currsum);
if(minsum > currsum){
    minsum=currsum;
}
                }
        }
        System.out.println("mimimum sum="+minsum);
    }
    


public static void main(String args[]){
    int number[]= {2, 4, 6, 8, 10};
    maxsubarrays(number);
    minsubarrays(number);


}
    
}
