package oops3;

public class AbstractDemo {

    public static void main(String[] args) {
//abstract object cannot be created
//        Vehicle vehicle = new Vehicle();
      //Creating obj of Car class
        Car car = new Car();
        //calling methods
        car.accelerate();
        car.brakes();

    }
}


abstract class Vehicle{
    //abstract method doesn't have a body
    abstract void accelerate();

    abstract void brakes();

}
// normal class inheriting from abstract class must implement abstract methods
class Car extends Vehicle{

// @ is an annotation that checks if method overridden exists in parent classes
    @Override
    void accelerate() {
        System.out.println("Car is accelerating.");
    }

    @Override
    void brakes() {
        System.out.println("Car's breaks are pushed.");

    }
}