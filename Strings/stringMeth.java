package Strings;

public class stringMeth {
    public static void main(String[] args) {

     String name = "  DiPaK";

        //all caps
        System.out.println(name.toUpperCase());

        //all lower case
        System.out.println(name.toLowerCase());

        //to remove spaces if any
        System.out.println(name.trim());

        //returns boolean if condition met (case sensitive)
        System.out.println("carpet".startsWith("car"));
        System.out.println("carpet".endsWith("pet"));

        //used to print a character present at an index of a string
        System.out.println(name.charAt(2));// out : D because there are spaces too

       //string conversion
        int age = 12;
        //String newAge = age; //not allowed
        String newAge = String.valueOf(age);
        System.out.println(age); //int
        System.out.println(newAge);//sting
    }
}
