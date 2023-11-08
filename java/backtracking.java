public class backtracking{



public static void findsubsets(String str, String ans, int i){
//base case
if(i==str.length()){
    System.out.println(ans);
    return;
}

//recursion
//yes choice
findsubsets(str, ans+str.charAt(i), i+1);
//no choice
findsubsets(str, ans, i+1);

}


    public static void printArr(int arr[]){
        for(int i=0 ; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void Changearray(int arr[], int i, int val){
        if(i==arr.length){
            printArr(arr);
            return;
        }
        arr[i]= val;
Changearray(arr, i+1, val+1);
arr[i]= val - 2;

    }
    public static void main(String args[]){
        //int arr[]= new int[5];
        //Changearray(arr, 0, 1);
       // printArr(arr);
    String str ="abc";
    //findsubsets(str, " ", 0);
    }
}
