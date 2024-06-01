package BASIC;

public class variablesDataTypes {
    public static void main(String[] args) {
        int a=55555555;
        float b=4.555f;
        char myChar= 'A';
        boolean isTrue = false;
        double secondB=3.14;
        short s= 124;
        long l= 8539845;
        String  str= "happy";
        // Implicit DataType Conversion = directly convert any small datatype into larger datatype
        // int - long, int - string
        System.out.println(str);

        int count= 13;
        long countLong = count;

        //print "countLong" to access "count"
        System.out.println(countLong);

        // Explicit datatype conversion is converting larger datatype to small
        long sum = 90;
        int sumLong= (int)sum;
        //print the int variable "sumLong" to access "sum"
        System.out.println(sumLong);

        int age=150;
        byte newAge= (byte)age; //Type CASTING/ TYPE CONVERSION
        //PRINT
        System.out.println(newAge);
    }
}
