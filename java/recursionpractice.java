public class recursionpractice {
    public static void printalloccurence(int arr[], int key, int i){
if( i== arr.length){
return;
}
if(arr[i]==key){
    System.out.println(i);
}
    printalloccurence(arr, key, i+1);
    }
    public static void main(String args[]){
        int arr[]= { 3, 2, 4, 5, 6, 2, 7, 2, 2};
            int key = 2;
            printalloccurence(arr , key ,0);
            System.out.println();
        }
    }
    