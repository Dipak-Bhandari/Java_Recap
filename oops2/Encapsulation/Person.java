package oops2.Encapsulation;

public class Person {
    //access modifiers used for data hiding and encapsulation
    private int age ;

    public String name;
    // static is a class property and can be accessed without
    //creating an object
    public  static  int Count= 0;

    Person (){
        Count++;
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
