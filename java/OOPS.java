import java.util.*;
public class OOPS {
    public static void main(String args[]){
        // Pen p1= new Pen();// created a pen object called p1
        // p1.setcolor("blue");
        // System.out.println(p1.color);
        // p1.setTip(5);
        // System.out.println(p1.tip);
        // p1.color= "Yellow";
        // System.out.println(p1.color);


        // Bankaccount myacc = new Bankaccount();
        // myacc.username="Diya Maheshwari";
        // myacc.setpass("jaimatadi");


        Student s1= new Student();
        s1.name= "diya";
        s1.roll=140;
        s1.pass="abcd";

        Student s4= new Student (s1);
        s2.pass="xyz";
        Student s2= new Student("Diya");
        Student s3= new Student(140);

    }
}

    class Bankaccount{
        public String username;
        private String password;
        void setpass(String pwd){
            password=pwd;
        }
    }

class Pen{
    String color;
    int tip;

    void setcolor(String newcolor){
        color= newcolor;
    }

    void setTip(int newtip){
        tip= newtip;
    }
}
class Student{
    String name;
    int roll;
    String pass;
    int marks[];
    //deep copy constructor
    Student(Student s1){
        marks=new int[3];
        this.name= s1.name;
        this.roll= s1.roll;
        for(int i=0; i<marks.length; i++){
            this.marks[i]= s1.marks[i];
        }
    }
//  shallow copy constructor
//     Student(Student s1){
// this.name= s1.name;
// this.roll= s1.roll;
//     }
    Student(){
        System.out.println("constructor is called....");
    }
    Student(String name){
        this.name= name;
    }
    Student (int roll){
        this.roll=roll;
    }
}

