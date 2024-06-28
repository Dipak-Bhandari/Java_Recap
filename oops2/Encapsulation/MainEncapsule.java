package oops2.Encapsulation;

public class MainEncapsule {
    public static void main(String[] args) {
        Person person = new Person();
//        person.name= "Mukesh";
//        System.out.println(person.name);

        // person.age = 34; // this gives error because it's private
        //calling setter method to set age
//        person.setAge(34);
        //calling getter method to print age
//        System.out.println(person.getAge());
        //creating person class's objects
        Person p2 = new Person();
        Person p3 = new Person();
        Person p4 = new Person();

        //calling default constructor Person  to
        //that increments count of objects created
        System.out.println("Objects created : "+Person.Count);
    }
}
