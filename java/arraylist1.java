import java.util.ArrayList;
import java.util.Collections;

public class arraylist1 {

    public static void swapnumbers(ArrayList<Integer> List , int idx1 , int idx2){
        int temp = List.get(idx1);
        List.set(idx1 , List.get(idx2));
        List.set(idx2 , temp);
    }

    public static void main(String args[]){
        ArrayList <Integer> List = new ArrayList<>();

        //ADD operation
        List.add(1);
        List.add(16);
        List.add(8);
        List.add(10);
        List.add(100);
        List.add(0);

        // System.out.println(List);
        // int idx1 =1 , idx2=3;
        // swapnumbers(List, idx1, idx2);
        // System.out.println(List);
        
        System.out.println(List);
        Collections.sort(List); // ascending order
        System.out.println(List);

        //descending
        Collections.sort(List , Collections.reverseOrder());
        System.out.println(List);
        //comparator - fxn logic , defines the sorting logic


        //Maximum number

        //time complexity -> O(n)
            int max = Integer.MIN_VALUE;
            for(int i=0; i<List.size();i++){
                // if(List.get(i) > max){
                //     max= List.get(i);
                max= Math.max(max, List.get(i));
                }
            System.out.print("max element=" +max);
            }
        }
            

        // System.out.println(List.size());

        // for(int i=0; i<List.size();i++){
        //     System.out.print(List.get(i)+" ");
        // }
        // System.out.println();

        // //Reverse of an arraylist

        // for(int i=List.size()-1; i>=0; i--){
        //     System.out.print(List.get(i));
        // }
        // System.out.println();


    //GET operation
        //System.out.println(  List.get(3));

        //REMOVE operation
        // List.remove(5);
        // System.out.println(List);


    //SET operation
    // List.set(2,10);
    // System.out.println(List);

    //CONTAINS operation
//   System.out.println( List.contains(10)); 
//   System.out.println(List.contains(14));

