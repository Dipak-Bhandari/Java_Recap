package useArrays;

public class arrayDeclare {
    public static void main(String[] args) {
    // we can store data in list using array
    // used in DSA
    // mostly used data structure
    // making a list using array and sorting it too
    // arrays are stored in contiguous[consecutive memory locations]
    // stores same type of data(e.g. int)
        // index starts from 0
       // int age[]; // creating array
        //or  int[] age;

       //age = new int[20]; //allocating memory to array

        int age[] = new int[5];

        age[0]=5; // storing data in array
        age[1]=6;

        System.out.println(age[0]); // printing data of array
        System.out.println(age[1]);
        System.out.println(age[2]);

        System.out.println(age.length); // prints size of array


    }
}
