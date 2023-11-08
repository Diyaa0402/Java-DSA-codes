import java.util.*;
public class bintodec {

    public static void bintodeci(int n){
        int p=0;
        int dec= 0;
        int LD;
        while(n>0){
            LD= n%10;
            dec =dec+ (LD * (int)Math.pow(2,p));
            n= n/10;
            p++;
        }
        System.out.print("decimal number = " + dec);

    }


    public static void decitobin(int n){
    int mynum =n;
        int pow=0;
        int bin=0;
        while(n>0){
            int rem= n%2;
            bin= bin+(rem*(int)Math.pow(10,pow));
            pow++;
            n=n/2;

        }
        System.out.println("binary number = "+bin);
        
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        // bintodeci(n);
        decitobin(n);
    }
    
}
