import java.util.*;
public class loops {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
// int n= sc.nextInt();
    // int num=1;
    // int sum=0;
    // while(num<=n){
    //     System.out.println(num +" ");
    //     num++;
    // }

    // sum = (n* (n+1))/2;
    // System.out.println("sum is "+ sum);

    // PRINT THE REVERSE OF A NUMBER

    // int v;
    // while(n>0){
    // v= (n%10);
    // System.out.print(v);
    // n= n/10;
    // }
    // System.out.println();

// BREAK :- TO EXIT THE LOOP
// CONTINUE:- TO SKIP THE ITERATION



    //using break statement

    // System.out.println("enter your number");
    // int n= sc.nextInt();
    // if(n%10==0){
    // System.out.println("its the multiple of 10");
    // }
    // else{
    //     System.out.println(n);

    // uSING CONTINUE STATEMENT

    // int n= sc.nextInt();
    // for(int i=1; i<=n; i++){
    //     if(i%10==0){
    //         continue;
    //     }
    //     System.out.println(i);

    //PRIME NO. OR NOT

    int n =sc.nextInt();
    boolean isPrime= true;
    for(int i=2; i<Math.sqrt(n); i++){
        if(n%i==0){
            isPrime=false;
            // System.out.println("not a prime no.");
        }
    }
    if(isPrime==true){
        System.out.println("prime no.");
    }else{
        System.out.println("not a prime no.");
    }
    }

}
    


