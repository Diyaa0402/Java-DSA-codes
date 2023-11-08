import java.util.*;
public class Bitmanipulation {
    public static void evenorodd(int n){
        int bitMask=1;
        if((n & bitMask)== 0){
            System.out.println("EVEN");
        
        }else {
            System.out.println("ODD");
        }
        System.out.println();

    }
    public static int getithbit(int n,int i){
        if((n & (1<<i))==0){
            return 0;
        }else {
            return 1;
        }
    }
    public static int setithbit(int n, int i){
            return (n| (1<<i));
}

public static int clearithbit(int n , int i){
    return (n^(1<<i));
}

public static int updatebit(int n, int i, int newbit){
//     if(newbit==0){
//         return clearithbit(n, i);
//     }else{
//     return setithbit(n, i);
//     }
// }
n= clearithbit(n, i);
int bitmask= newbit<<i;
return n|bitmask;
}

public static int clearlastithbits(int i, int n){
    return (n &((-1)<<i));
}

public static boolean ispoweroftwo(int n) {
    return (n & (n-1))==0;
    }

    public static int countsetbits(int n){
        int count=0;
        while(n>0){
        if((n&1)==1){
            count++;
        }
        n=(n>>1);
    }
        return count;
    }
    public static int rangeofbit(int i, int j, int n){
        int a= ((-1) <<(j+1));
        int b= (1<<i)-1;
        int bitmask = (a|b);
        return (n & bitmask);
    }
    public static int modularexp(int a, int n, int p){
        int ans= fastexpo(a, n);
        return (ans % p);
    }

    public static int fastexpo(int a, int n){
        int ans=1; 

        while (n>0){
            if((n&1)!=0){ //CHECK LSB
                ans= ans *a;
            }
            a= a*a;
            n= n>>1;
            }
            return ans;
        }
    

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        //int i= sc.nextInt();
        int n= sc.nextInt();
        int p = sc.nextInt();
      //  int j= sc.nextInt();
       // evenorodd(n);
       // System.out.println(getithbit(n, i));
       // System.out.println(setithbit(n, i));
       //System.out.println(clearithbit(n, i));
    //System.out.println(updatebit(n, i, 1));
    //System.out.println(clearlastithbits(i, n));
    //System.out.println(ispoweroftwo(n));
    //System.out.println(countsetbits(n));
   // System.out.println(rangeofbit(i, j, n));
//System.out.println(fastexpo(a, n));
System.out.println(modularexp(a, n, p));

    }
}
