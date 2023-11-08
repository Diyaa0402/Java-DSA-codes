import java.util.*;
public class palin {

    public static void pali(int n){
        int num=0;
        while(n!=0){
            int rem= n%10;
            num= num*10 +rem;
            n=n/10;

        }
    System.out.println(num);
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        pali(n);
    
}
    }
    

