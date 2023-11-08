import java.util.*;
public class strings {
    public static void printletters(String Fullname){
    for(int i=0; i<Fullname.length(); i++){
        System.out.print(Fullname.charAt(i) +" ");
    }
    }
    public static void main(String args[]){
        char arr[]= {'a','b','c'};
        String str="abcd";
        String str2= new String("xyz");

        //STRINGS are IMMUTABLE i.e we cannot make changes in the existing string
        Scanner sc= new Scanner(System.in);
        // String name;
       // name= sc.next(); // to print words
        // name= sc.nextLine();  //to print sentence
        // System.out.println(name);

        String name="Diya Maheshwari";
        System.out.println(name.length());


        //concatenation
        String firstname= "Diya";
        String secname= "Maheshwari";
        String Fullname= firstname + " " + secname;
      //  System.out.println(Fullname.charAt(0));
        printletters(Fullname);

        //equality of two strings
        String s1= "diya";
        String s2= "diya";
        String S3= new String("diya");


        if(s1.equals(S3)){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }

        //substring
        String s4= "DIYA ABHISHEK";
       // System.out.println(s4.substring(1,8));
    String s5= s4.substring(5,8);
    String s6= s4.substring(2,4);
    System.out.println(s5+s6);



    }
    
}
