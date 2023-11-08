import java.util.*;
public class fibonacci {

    public static int Firstocc(int key, int arr[], int i) {
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i]== key){
            return i;
        }
        return Firstocc(key, arr, i+1);
    }

    public static int lastocc(int key, int arr[], int i) {
        if(i==0){
            return -1;
        }
        if(arr[i]== key){
            return i;
        }
        return lastocc(key, arr, i--);

    }

    public static int printxpow(int x, int n) {
        if(n==1){
            return x;
        }

        int powxmn = printxpow(x,n-1);
        int powxn = x* powxmn;
        return powxn;
        
    }


    public static int printfib(int n){
        if(n==0 || n==1){
            return n;
        }

        int Fnm1= printfib(n-1);
        int Fnm2= printfib(n-2);
        int Fibn= Fnm1+ Fnm2;
        return Fibn;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int x= sc.nextInt();
    //int arr[]= {1, 6, 7, 4, 6, 2, 8, 1};
   // int key= 6;
   // System.out.println(printfib(n)); 
//System.out.println(Firstocc(9, arr, 0));
//System.out.println(lastocc(1, arr, arr.length-1));
System.out.println(printxpow(x, n));


    }
}
