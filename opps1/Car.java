package opps1;
//inherits vehicle class
public class Car extends Vehicle {

    public static void main(String[] args) {
        //object initialized
        Car car = new Car();
        //parameters passed
        car.WheelsCount=4;
        car.color="Cream";
        car.plateNo="B_kha-3_4141";
        car.model="Volvo";
        //calling function
        car.start();


    }
}
