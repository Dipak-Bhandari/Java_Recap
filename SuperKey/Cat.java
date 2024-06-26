package SuperKey;
//inherits properties of animal class
public class Cat extends Animal {
//properties of cat class
    String name;
    String breed;
    int legs;
//function of cat class
void noise(){
    //looking at parent implementation using super keyword
    super.noise();
    System.out.println("Cat is Purring");
}

void mew(){
    System.out.println("Cat is mewing.");
}
// main method
public static void main(String[] args) {
//cat instance
    Cat cat = new Cat();
    cat.legs=4;
    cat.name="Billi";
    cat.breed= "eastern";
    cat.noise();        //calling functions
    cat.mew();
    System.out.println("Cat named "+cat.name+" is "+cat.breed+" and has "+cat.legs+" legs.");
    }

}
