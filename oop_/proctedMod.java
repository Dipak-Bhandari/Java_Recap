package oop_;

// class uses Default access modifier
class protecedMod
{
    void display()
    {
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        protecedMod pp= new protecedMod();
        pp.display();
    }
}




