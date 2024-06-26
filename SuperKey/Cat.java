package SuperKey;

public class Cat extends Animal {

    String name;
    String breed;
    int legs;

void noise(){
    super.noise();
    System.out.println("Cat is Purring");
}

void mew(){
    System.out.println("Cat is mewing.");
}
    public static void main(String[] args) {

    Cat cat = new Cat();
    cat.legs=4;
    cat.name="Billi";
    cat.breed= "eastern";
    cat.noise();
    cat.mew();
    System.out.println("Cat named "+cat.name+" is "+cat.breed+" and has "+cat.legs+" legs.");
    }

}
