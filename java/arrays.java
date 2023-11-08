import java .util.*;
public class arrays {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int marks[]= new int[100];
        marks[0]= sc.nextInt();
        marks[1]= sc.nextInt();
        marks[2]= sc.nextInt();

        System.out.println("phy :"+marks[0]);
        System.out.println("che :"+marks[1]);
        System.out.println("math :"+marks[2]);

        int per= (marks[0]+ marks[1]+ marks[2])/3;
        System.out.println("percentage :"+per +"%");

        System.out.println(marks.length);
    }
    
}
 