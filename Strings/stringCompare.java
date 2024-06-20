package Strings;

public class stringCompare {
    public static void main(String[] args) {
        //init String literal
        String name = "Dipak";
        String newName = "Dipak";
        //init using new keyword
        String myName = new String( "Dipak");

        System.out.println(name);
        System.out.println(newName);

        //both are same because both variable points at same data in string pool
        if(name==newName)
            System.out.println("both are same.");

        //both are not same although same data is stored; one is in string pool
        //other is outside of it
        if(name == myName){
            System.out.println("both are same");
        }else{
            System.out.println("not same");
        }

    }
}
