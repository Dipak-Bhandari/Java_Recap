package oops2.Encapsulation;

public class MainEncapsule {
    public static void main(String[] args) {
        Person person = new Person();
        person.name= "Mukesh";
        System.out.println(person.name);

        // person.age = 34; // this gives error because it's private
        //calling setter method to set age
        person.setAge(34);
        //calling getter method to print age
        System.out.println(person.getAge());

    }
}
