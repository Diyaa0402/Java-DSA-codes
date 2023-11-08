public class interfaces{
    public static void main(String args[]){
            // Queen q= new Queen();
            // q.moves();

Bear B = new Bear();
B.eat();
B.eats();
    }
}


interface Herbivore{
void eat();
}
interface Carnivore{
    void eats();
}
class Bear implements Herbivore,Carnivore{  // MULTIPLE INHERITANCE
public void eat(){
    System.out.println("eats grass ");
}
public void eats(){
    System.out.println("eats meat");
}
}
interface Chessplayer{
    void moves();
}
class Queen implements Chessplayer{
    public void moves(){
        System.out.println("up, down, right, left (in all 4 dir)");
    }
}
class Rook implements Chessplayer{
    public void moves(){
        System.out.println("up, right, down, left");
    }
}
class king implements Chessplayer{
    public void moves(){
        System.out.println("up, down, right, left , diagonal(by 1 step)");
    }
}


//Static keyword- properties, functions , blocks , nested classes

