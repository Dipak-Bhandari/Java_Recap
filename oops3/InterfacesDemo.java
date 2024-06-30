package oops3;

//abstraction can be achieved via interfaces too
//with the help of interfaces we can achieve multiple inheritance in java
//creating interface
interface Animal{
    //same as abstract class its methods doesn't have body

    void walks();
    void eats();

}
//creating second interface
interface wildAnimal{

    void destroy();
    void harms();
}
// implements keyword is used to implement interface
//Rihno is implementing both Animal and wildAnimal interfaces
//this is how multiple inheritance is achieved
class Rhino implements Animal, wildAnimal{

    @Override
    public void walks() {
        System.out.println("Rhino is walking through city.");
    }

    @Override
    public void eats() {

        System.out.println("Rhino is eating grass.");
    }

    @Override
    public void destroy() {
        System.out.println("Rhino destroys crops.");
    }

    @Override
    public void harms() {
        System.out.println("Rhino harms people.");
    }
}
//main method
public class InterfacesDemo {
    public static void main(String[] args) {
        //creating instances
        Rhino r1 = new Rhino();
//calling overridden methods
        r1.eats();
        r1.walks();
        r1.harms();
        r1.destroy();
    }
}

