import java.util.*;
public class function {
    public static double product(double num1, double num2){ // parameters or formal parameters
        double pro= num1*num2;
        return pro;
        
    }

    public static int factorial(int n){
        int fact=1;
        for(int i=1; i<=n; i++){
            fact= i*fact;
        }
            return fact; 
        }
// to check whether it is prime or not
        // public static boolean isprime(int n){
        //     boolean isprime= true;
        //     for(int i=2; i<Math.sqrt(n); i++){
        //         if(n%i==0){
        //             isprime = false;
        //     }else{
        //         System.out.println(n);
        //     }
        //     return isprime;
                

        public static boolean isprime(int n){
            boolean prime= true;
            for(int i=2; i<n; i++){
                if(n%i==0){
                    prime =false;
                    break;
                }
            }
            return prime;
        }

// prime in range

public static void primeinrange(int n){
    boolean isprime=true;
    for(int i=2; i<=n; i++){
        if(isprime(i)==true)
        {
            System.out.println(i);
        }
    }
}
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
        // double a= sc.nextDouble();
        // double b= sc.nextDouble();
        // double pro= product(a,b); // arguments or actual parameters
        // System.out.println("product is =" +pro);
        // System.out.println(factorial(10));
        // int r= sc.nextInt();
        // int n=sc.nextInt();
        // int F=factorial(n);
        // int R= factorial(r);
        // int B= factorial(n-r);
        // System.out.println(F/(R*B));
        // System.out.println(isprime(n));
        primeinrange(20);

    }
    
}
