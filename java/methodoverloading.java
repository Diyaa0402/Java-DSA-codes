public class methodoverloading {
    public static void main(String args[]){

    Calculator calc= new Calculator();    // object creation
    System.out.println(calc.sum(8,10));
    System.out.println(calc.sum((float)3.4, (float)3.7));
    System.out.println(calc.sum(3,6, 9));

Deer ani= new Deer();  // method overriding
ani.eat();  // method overriding:- will call only the function of a child class 
    
}
}
class Annimal{
    void eat(){
        System.out.println("eats anything");
    }
    } 
    class Deer extends Animal{
        void eat(){
            System.out.println("eats grass");
        }
}
class Calculator{
    int sum(int a, int b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
    float sum(float a, float b){
        return a+b;
    }
}
