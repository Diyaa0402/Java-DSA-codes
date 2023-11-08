public class abstracttclass {
    public static void main(String args[]){
// Horse h= new Horse();
// h.eat();
// h.walk();
Mustang myhorse = new Mustang();
// Animal-> horse -> mustang
    }
    
}
abstract class Animal{
    String color;
    Animal(){
        //color="brown";
        System.out.println("Animal constructor called");
    }
    void eat(){
        System.out.println("eats anything");
    }
    abstract void walk();// no implementation i.e only idea
}

class Horse extends Animal{
    Horse(){
        super();
        System.out.println("horse constructor called");
    }
    void chacgecolor(){
        color="dark brown";
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
    System.out.println("mustang constructor called");
}
}
class Chicken extends Animal{
    void chacgecolor(){
        color="yellow";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}

// 1ST - animal constructor will be called then horse nd then mustang