import java.util.*;
public class arrays1 {
    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i]= 1+ marks[i];
        }
    }

    public static int linear_search(int mem[], int key){
        for(int i=0; i<mem.length; i++){
            if(mem[i]==key){
                return i;
            }
            }
            return -1;
        }

        public static int largest_num(int num[]){
            int large= Integer.MIN_VALUE;   // -infinity
            for(int i=0; i<num.length; i++){
                if(large< num[i]){
                    large = num[i];
                }

            }
            return large;
        }
    public static void main(String args[]){
        // int marks[]={ 80,89,99};
        // update(marks);

        // to print the marks:- arrays uses pass by reference
        // for(int i=0; i<marks.length; i++){
        // System.out.print(marks[i]+ " ");
        // }
        // System.out.println();

        // int mem[]={ 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        // int key=1000;
        // int index= linear_search(mem,key);
        // if(index==-1){
        //     System.out.println("not found");
        // }else
        // System.out.println("key is at index " +index);

        int num[]={ 10, 40,37, 39, 20, 19,46,60,11};
        int lar= largest_num(num);
        System.out.println("largest of all numbers =" +lar);

    }
}
