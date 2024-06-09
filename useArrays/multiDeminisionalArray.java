package useArrays;
public class multiDeminisionalArray {
    public static void main(String args[]) {
        // 2D Array
        // in initialization we have to declare the size of that array too

//    int marks[][] = new int[3][4];  // initialization if 2D Array
//
//    marks[0][0]=65; // Declaration of 2D Array
//    marks[0][1]=65;
//    marks[0][2]=65;
//
//    marks[1][0]=65;
//    marks[1][1]=65;
//    marks[1][2]=65;
//
//    marks[2][0]=65;
//    marks[2][1]=65;
//    marks[2][2]=65;
//        System.out.println(marks[0][0]); // prints the value of row 0 col 0
//        System.out.println(marks[0][4]); // exception ArrayIndexOutOfBounds
        // another way
    int marks[][]= {
            {27,52,64},
            {27,65,64},
            {12,65,44},
            {12,52,44}
    };
        System.out.println(marks[2][2]); // output 44 in row 2 col 2
    }
}