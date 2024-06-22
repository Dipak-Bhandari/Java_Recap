package oop_;

public class classAndObjs {
    public static void main(String[] args) {
        // constructs a new dog object
        dog d1 = new dog();
        //assigns name to dog d1 object
         d1.name = "Tommy";
         d1.breed="pomorarian";
         d1.age=5;
         d1.color="brown";
         //calls bark() function
        d1.bark();

        //cat object construction
        cat c1 = new cat();
        c1.name="xi";
        c1.breed="persian";
        c1.age=5;
        c1.color="black";
        c1.mew();

    }
}
class cat{
    String name ;
    String color;
    String breed;
    int age;

    void walk(){
        System.out.println(name+" is walking!!");
    }
    void mew(){
        System.out.println(name+" is mewing!!");
    }
}
class dog{
    String name ;
    String color;
    String breed;
    int age;

    void walk(){
        System.out.println(name+" is walking!!");
    }
    void bark(){
        System.out.println(name+" is barking!!");
    }
}