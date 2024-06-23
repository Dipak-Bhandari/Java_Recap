package oop_;

//two or more methods can have same name inside same class
// if they take different arguments
//it can be achieved : 1. changing number of arguments
//2.changing the data type of argument
public class MethodOverload {
    public static void main(String[] args) {
        //creating greet object
        Greet gg = new Greet();
        //calling function
        gg.greetings();
        gg.greetings("Dipu");
        gg.greetings("Rohit",5);
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
    void greetings(String name, int count){
        for (int i = 0; i <count ; i++) {
            System.out.println("Hello "+name+", Good morning!");
        }
    }
}