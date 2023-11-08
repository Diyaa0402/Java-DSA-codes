import java.util.*;

import javax.annotation.processing.SupportedSourceVersion;

public class recursion {
    public static void printdec(int n){
        if(n==1){
            System.out.print(n);
            return;
        }

        System.out.print(n +" ");
        printdec(n-1);
    }

    public static void printinc(int n){
        if(n==1){
            System.out.print(n);
            return;
        }

        printinc(n-1);
        System.out.print(n+" ");
    }

    public static int printfactorial(int n){
        if(n==0){
            return 1;
        }
    int fnm1=(printfactorial(n-1));
        int fn = (n*fnm1);
        return fn;
    }

    public static int printsum(int n){
        if(n==1){
            return 1;
        }
        int Snm1=printsum(n-1);
        int Sn = n+ Snm1;
        return Sn;
    }

    public static int printfibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        int fibnm1= printfibonacci(n-1);
        int fibnm2= printfibonacci(n-2);
        int fibn= fibnm1+ fibnm2;
        return fibn;
    }

    public static boolean issorted(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
    return issorted(arr, i+1);
    }


    public static int firstoccurence(int arr[], int key, int i){
        if(i==arr.length-1){
            return -1;
        }
        if(key ==arr[i]){
        return i;
        }
return firstoccurence(arr, key, i+1);

    }

    public static int lastoccurence(int arr[], int key, int i){
        if(i==arr.length-1){
            return -1;
        }
        int isFound= lastoccurence(arr, key, i+1);
        if(isFound==-1 &&key ==arr[i]){
            return i;
}
return isFound;
    }


    public static int printxpowern(int x, int n){
        if(n==0){
            return 1;
        }
        int xpnm1= printxpowern(x, n-1);
        return (x* xpnm1);
    }

    public static int optimizedPower(int a , int n){
        if(n==0){
            return 1;
        }
    
        int halfpower= optimizedPower(a, n/2);
        int halfpowersq = halfpower*halfpower;

        //n is odd
        if(n%2!=0){
            return a* halfpowersq;
    }
    return halfpowersq;
    }


    public static int tilingways(int n){   //(2*n) fllor size
        if(n==0 || n==1){
            return 1;
        }
        //vertical tiling
        int verticaltiles= tilingways(n-1);
        // horizontal tiling
        int horizontaltiles = tilingways(n-2);
        int totalways = verticaltiles + horizontaltiles;
        return totalways;
    }


    public static void removeduplicates(String str , int idx , boolean map[], StringBuilder newstr){
        if(idx == str.length()){
            System.out.println(newstr); 
            return;
        }
        char currchar = str.charAt(idx);
        if(map[currchar -'a']== true){
            //duplicate
            removeduplicates(str, idx+1, map, newstr);
        }else {
            map[currchar - 'a']= true;
            removeduplicates(str, idx+1, map, newstr.append(currchar));
        }
    }


    public static int friendspairing(int n){
        if(n==1 || n==2){
        return n ;
    }
    //choices :- single
    int single= friendspairing(n-1);
    //choice:- pair
    int pair = (n-1)*friendspairing(n-2);
      
    int totalways = single + pair;
    return totalways;
    }


    public static void printbinarystrings(int n, int lastplace, String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        // if( lastplace == 0){
        //     printbinarystrings(n-1, 0, str.append("0"));
        //     printbinarystrings(n-1, 1, str.append("1"));
        // }else 
        // printbinarystrings(n-1, 0, str.append("0"));

        printbinarystrings(n-1, 0, str=+"0");
        if(lastplace==0){
            printbinarystrings(n-1, 1, str=+"1");
        }

    }
    public static void main(String args[]){
       // int n=5;
        //int arr[]={8, 3, 6,9,5,10,2,5,3};
       // int key=5;
//String str = "appnacollege";
   // removeduplicates(str, 0, new boolean[26], new StringBuilder(""));
//System.out.println(friendspairing(3));
printbinarystrings(3, 0, " ");
        
//printdec(n);
//printinc(n);
//System.out.println(printfactorial(n));
//System.out.println(printsum(n));
//System.out.print(printfibonacci(n));
//System.out.println(issorted(arr,0 ));
//System.out.println(firstoccurence(arr, key, 0));
//System.out.println(lastoccurence(arr, key, 0));
//System.out.println(printxpowern(2,10));
//System.out.println(optimizedPower(3,5));
//System.out.println(tilingways(4));


    }
}