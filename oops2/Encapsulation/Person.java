package oops2.Encapsulation;

public class Person {
    //access modifiers used for data hiding and encapsulation
    private int age ;

    public String name;
    // static is a class property and can be accessed without
    //creating an object
    public  static  int Count= 0;
//default constructor
    Person (){
        Count++;
    }

    // static method
    public static void PrintHello(){
        System.out.println("Hello From static method");
    }

    //method to set age
    public void setAge(int age){
        this.age= age;
    }
    //returns age
    public int getAge(){
        return age;
    }
}
