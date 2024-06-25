package opps1;

//creates a class nammed vehicle
public class Vehicle {
    //properties of vehicle that can be inherited by other classes
    int WheelsCount;
    String model;
    String color;
    String plateNo;

    //start function
    void start(){
        System.out.println("Car named "+model+
                " having plate num: "+plateNo+" and color: "
                +color+" is running on "+WheelsCount+" wheels.");
    }
}
