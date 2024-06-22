package oop_;

//two or more methods can have same name inside same class
// if they take different arguments
public class MethodOverload {
    public static void main(String[] args) {

        Greet gg = new Greet();
        gg.greetings();
        gg.greetings("Dipu");

    }
}
class Greet{

    void greetings(){
        System.out.println("Hello, Good morning!");
    }
    //overload same method with name parameter
    void  greetings(String name){

        System.out.println("Hello "+name+", Good morning!");
    }

}