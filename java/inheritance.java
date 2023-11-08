public class inheritance {
    public static void main(String args[]){
        // Fish shark= new Fish();
        // shark.eat();
        // shark.swims();
        Dog dobby = new Dog();
        dobby.eat();
        dobby.leg=4;

    }
    
}
//Base class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
void breathe(){
    System.out.println("brethes");
}
}
//derived class
// class Fish extends Animal{
//     int fins;
// void swims(){
//     System.out.println("swims");
    
// }
class Mammal extends Animal{
    int legs;
}
class Dog extends Mammal{
    String breed;
}